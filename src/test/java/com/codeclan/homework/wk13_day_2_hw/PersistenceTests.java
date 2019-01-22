package com.codeclan.homework.wk13_day_2_hw;

import com.codeclan.homework.wk13_day_2_hw.models.Folder;
import com.codeclan.homework.wk13_day_2_hw.models.User;
import com.codeclan.homework.wk13_day_2_hw.repositories.FileRepository;
import com.codeclan.homework.wk13_day_2_hw.repositories.FolderRepository;
import com.codeclan.homework.wk13_day_2_hw.repositories.UserRepository;
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

	@Ignore
	@Test
	public void canCreateUser() {
		userRepository.deleteAll();
		User user = new User("Joe Bloggs");
		userRepository.save(user);
		assertEquals(1, userRepository.count());
	}

	@Test
	public void canCreateFolder() {
		folderRepository.deleteAll();
		userRepository.deleteAll();
		User user = new User("Joe Bloggs");
		Folder folder = new Folder("/users/jbloggs", user);
		user.addFolder(folder);
		userRepository.save(user);
		folderRepository.save(folder);
		assertEquals(1, folderRepository.count());
		assertEquals(1, user.getFolders().size());
		assertEquals(folder, user.getFolders().get(0));
	}
}
