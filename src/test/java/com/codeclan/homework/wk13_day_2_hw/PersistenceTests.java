package com.codeclan.homework.wk13_day_2_hw;

import com.codeclan.homework.wk13_day_2_hw.models.File;
import com.codeclan.homework.wk13_day_2_hw.models.Folder;
import com.codeclan.homework.wk13_day_2_hw.models.User;
import com.codeclan.homework.wk13_day_2_hw.repositories.FileRepository;
import com.codeclan.homework.wk13_day_2_hw.repositories.FolderRepository;
import com.codeclan.homework.wk13_day_2_hw.repositories.UserRepository;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersistenceTests {

	@Autowired
	 FileRepository fileRepository;

	@Autowired
	 FolderRepository folderRepository;

	@Autowired
	 UserRepository userRepository;

	@Before
	public void setUp() {
		fileRepository.deleteAll();
		folderRepository.deleteAll();
		userRepository.deleteAll();
	}

	@Test
	public void canCreateUser() {
		User user = new User("Joe Bloggs");
		userRepository.save(user);
		assertEquals(1, userRepository.count());
	}

	@Test
	public void canCreateFolderUnderUser() {
		User user = new User("Joe Bloggs");
		Folder folder = new Folder("/users/jbloggs", user);
		user.addFolder(folder);
		userRepository.save(user);
		folderRepository.save(folder);
		assertEquals(1, folderRepository.count());
		assertEquals(1, user.getFolders().size());
		assertEquals(folder, user.getFolders().get(0));
	}

	@Test
	public void canAddFilesToFolder() {
		User user = new User("Joe Bloggs");
		userRepository.save(user);

		Folder root = new Folder("",user);
		folderRepository.save(root);

		File file1 = new File("foo",".txt",1024L,root);
		File file2 = new File("install",".log",5143L,root);

		fileRepository.save(file1);
		fileRepository.save(file2);

		assertEquals(1,userRepository.count());
		assertEquals(1,folderRepository.count());
		assertEquals(2,fileRepository.count());
	}
}
