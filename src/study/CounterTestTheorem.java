package study;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.fest.swing.fixture.FrameFixture;

public class CounterTestTheorem {
	private FrameFixture frame;//����FrameFixture��������fest-swing��jar�У�
	

	@Before
	public void setUp() throws Exception {
		frame=new FrameFixture(new Theorem());//��Theorem�����ɶ���ʵ������frame
		frame.show();//��ʾTheorem����		
	}

	@After
	public void tearDown() throws Exception {
		frame.cleanUp();//����Theorem����		
	}

	@Test	
	public void testTheorem(){//��Theorem���в���
		frame.textBox("aa").enterText("3");//��aa�ı���������3
		frame.textBox("bb").enterText("4");//��bb�ı���������4
		frame.button("c").click();//������ťC
		frame.textBox("cc").requireText("5");//���Ϊ5��ȷ���������
		clear();
		frame.textBox("aa").enterText("6");//
		frame.textBox("cc").enterText("10");//ͬ��
		frame.button("b").click();//
		frame.textBox("bb").requireText("8");//	
		clear();
	}
	public void clear(){//���ı�����������
		frame.textBox("aa").deleteText();
		frame.textBox("bb").deleteText();
		frame.textBox("cc").deleteText();
	}

}
