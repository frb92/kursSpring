package com.example.kursspring;

import com.example.kursspring.domain.Castle;
import com.example.kursspring.domain.CastleTest;
import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.Quest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest()
class KursspringApplicationTests {

	@Autowired
	Knight knight;

	@Autowired
	Castle castle;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCaste(){
		String except = "Znajduje sie tu zamek o naziwe Dark souls zamieszkaly przez rycerza Rycerz o imieniu: Lancelot" +
				" w wieku: 29 ma zadanie Zadanie: Uratuj ksiezniczke";
		assertEquals(except, castle.toString());
	}
}
