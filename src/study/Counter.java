package study;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Counter extends JFrame implements ActionListener {
	public static void main(String[] args) {//������
		Counter thisClass = new Counter();		
		thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ʵ�ֹرմ���
		thisClass.setVisible(true); 
		
	}
	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanel = null;
	private JButton jButton = null;
	private JButton jButton1 = null;
	private JButton jButton2 = null;
	private JButton jButton3 = null;
	private JButton jButton4 = null;
	private JButton jButton5 = null;
	private JButton jButton6 = null;
	private JButton jButton7 = null;
	private JButton jButton8 = null;
	private JButton jButton9 = null;
	private JButton jButton10 = null;
	private JButton jButton11 = null;
	private JButton jButton12 = null;
	private JButton jButton13 = null;
	private JButton jButton14 = null;
	private JButton jButton15 = null;
	private JButton jButton16 = null;
	private JButton jButton17 = null;
	private JButton jButton18 = null;
	private JButton jButton19 = null;
	private JTextField jTextField = null;
	private JTextField textMemory= null;//��Ϊ����M��
	private JButton jButton20 = null;
	private JButton jButton21 = null;
	private JButton jButton22 = null;
	private JButton jButton23 = null;
	private JButton jButton24 = null;
	private JButton jButton25 = null;
	private JButton jButton26 = null;
	
	double memoryd; //ʹ���ڴ��д洢������
	int memoryi;
	
//��ѧ��������ť
	private JButton jButton31 = null;
	private JButton jButton32 = null;
	private JButton jButton33 = null;
	private JButton jButton34 = null;
	private JButton jButton35 = null;
	private JButton jButton36 = null;
	private JButton jButton37 = null;
	private JButton jButton38 = null;
	private JButton jButton39 = null;
	private JButton jButton40 = null;
	private JButton jButton41 = null;
	private JButton jButton42 = null;
	private JButton jButton43 = null;
	private JButton jButton44 = null;
	private JButton jButton45 = null;
	
//A-F
	private JButton jButton46 = null;
	private JButton jButton47 = null;
	private JButton jButton48 = null;
	private JButton jButton49 = null;
	private JButton jButton50 = null;
	private JButton jButton51 = null;
	private JPanel jPanel1 = null;
	private JPanel jContentPane1 = null;
	
	private String str=""; 
	private double dataone;
	private char Operator='A';
//	private boolean pointIsTyped=false;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenu = null;
	private JMenuItem jMenuItem = null;
	private JMenuItem jMenuItem1 = null;
	private JMenu jMenu1 = null;
	private JMenuItem jMenuItem3 = null;
	private JMenuItem jMenuItem4 = null;
	private JMenu jMenu2 = null;
	private JMenuItem jMenuItem5 = null;
	private JMenuItem jMenuItem6 = null;
	private JMenuItem jMenuItem7 = null;
	private JMenuItem jMenuItem8 = null;
	DecimalFormat df;//����С��λ��
	
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("9");
			jButton.setFont(new Font("����", Font.BOLD, 30));
			jButton.setForeground(new Color(250,0,0));        //��ɫ����ɫ����ɫ
			jButton.setFocusable(false);
			jButton.addActionListener(new ActionListener() {//�����������9
				public void actionPerformed(ActionEvent e) {
					str+="9";
					jTextField.setText(str);	
				}
			});

			jButton.addMouseListener(new MouseListener(){ //������ť���ɫ
				public void actionPerformed(MouseEvent e) {
					jButton.setForeground(new Color(0,100,0));
				}
				public void mouseClicked(MouseEvent e) {
					jButton.setForeground(new Color(0,150,100));
				}
				public void mouseEntered(MouseEvent e) {
					jButton.setForeground(new Color(0,0,250));
				}
				public void mouseExited(MouseEvent e) {
					jButton.setForeground(new Color(250,0,0));
				}
				public void mousePressed(MouseEvent e) {
					jButton.setForeground(new Color(0,250,0));
				}
				public void mouseReleased(MouseEvent e) {
					jButton.setForeground(new Color(250,250,0));
				}
			}
			);		
		}
		return jButton;
	}
	private JButton getJButton1() {//����ť
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("/");
			jButton1.setFont(new Font("����", Font.BOLD, 30));
			jButton1.setForeground(new Color(0,150,100));
			jButton1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {//�����������/
					str=jTextField.getText();
					Operator='/';
					dataone=Double.parseDouble(str);
					str="";
					jTextField.setText(str);
				}
			});
		}
		return jButton1;
	}
	private JButton getJButton2() {//��ƽ����ť
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("��");
			jButton2.setFont(new Font("����", Font.BOLD, 30));
			jButton2.setForeground(new Color(0,0,200)); 
			jButton2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {//�����¼���
					double a=Double.parseDouble(jTextField.getText());
					double b;
					if(a<0){
						jTextField.setText("�������ܿ�ƽ��");
					}
					else{                              //ʵ�ֿ���
						b=Math.sqrt(a);
						jTextField.setText(Double.toString(b));
					}
				}
			});
		}
		return jButton2;
	}
	private JButton getJButton3() {//4��ť
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("4");
			jButton3.setFont(new Font("����", Font.BOLD, 30));
			jButton3.setForeground(new Color(250,0,0));
			jButton3.setFocusable(false);
			jButton3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str+="4";
					jTextField.setText(str);
				}
			});
			jButton3.addMouseListener(new MouseListener(){//������ť��ɫ
				public void actionPerformed(MouseEvent e) {
					jButton3.setForeground(new Color(0,100,0));
				}
				public void mouseClicked(MouseEvent e) {
					jButton3.setForeground(new Color(0,150,100));
				}
				public void mouseEntered(MouseEvent e) {
					jButton3.setForeground(new Color(0,0,250));
				}
				public void mouseExited(MouseEvent e) {
					jButton3.setForeground(new Color(250,0,0));
				}
				public void mousePressed(MouseEvent e) {
					jButton3.setForeground(new Color(0,250,0));
				}
				public void mouseReleased(MouseEvent e) {
					jButton3.setForeground(new Color(250,250,0));
				}
			}
			);
		}
		return jButton3;
	}
	private JButton getJButton4() {//5��ť
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("5");
			jButton4.setFont(new Font("����", Font.BOLD, 30));
			jButton4.setForeground(new Color(250,0,0));
			jButton4.setFocusable(false);
			jButton4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str+="5";
					jTextField.setText(str);
				}
			});
			jButton4.addMouseListener(new MouseListener(){//������ť��ɫ
				public void actionPerformed(MouseEvent e) {
					jButton4.setForeground(new Color(0,100,0));
				}
				public void mouseClicked(MouseEvent e) {
					jButton4.setForeground(new Color(0,150,100));
				}
				public void mouseEntered(MouseEvent e) {
					jButton4.setForeground(new Color(0,0,250));
				}
				public void mouseExited(MouseEvent e) {
					jButton4.setForeground(new Color(250,0,0));
				}
				public void mousePressed(MouseEvent e) {
					jButton4.setForeground(new Color(0,250,0));
				}
				public void mouseReleased(MouseEvent e) {
					jButton4.setForeground(new Color(250,250,0));
				}
			}
			);
		}
		return jButton4;
	}
	private JButton getJButton5() {//6��ť
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setText("6");
			jButton5.setFont(new Font("����", Font.BOLD, 30));
			jButton5.setForeground(new Color(250,0,0));
			jButton5.setFocusable(false);
			jButton5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str+="6";
					jTextField.setText(str);
				}
			});
			jButton5.addMouseListener(new MouseListener(){
				public void actionPerformed(MouseEvent e) {
					jButton5.setForeground(new Color(0,100,0));
				}
				public void mouseClicked(MouseEvent e) {
					jButton5.setForeground(new Color(0,150,100));
				}
				public void mouseEntered(MouseEvent e) {
					jButton5.setForeground(new Color(0,0,250));
				}
				public void mouseExited(MouseEvent e) {
					jButton5.setForeground(new Color(250,0,0));
				}
				public void mousePressed(MouseEvent e) {
					jButton5.setForeground(new Color(0,250,0));
				}
				public void mouseReleased(MouseEvent e) {
					jButton5.setForeground(new Color(250,250,0));
				}
			}
			);
		}
		return jButton5;
	}
	private JButton getJButton6() {
		if (jButton6 == null) {
			jButton6 = new JButton();
			jButton6.setText("*");
			jButton6.setFont(new Font("����", Font.BOLD, 30));
			jButton6.setForeground(new Color(0,150,100));
			jButton6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str=jTextField.getText();
					Operator='*';
					dataone=Double.parseDouble(str);
					str="";
					jTextField.setText(str);
				}
			});
		}
		return jButton6;
	}
	private JButton getJButton7() {
		if (jButton7 == null) {
			jButton7 = new JButton("%");
			jButton7.setFont(new Font("����", Font.BOLD, 30));
			jButton7.setForeground(new Color(0,0,200)); 
			jButton7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double i1=Double.parseDouble(jTextField.getText());
					double z1=i1/100;
					jTextField.setText(Double.toString(z1));//ʵ�ְٷֱ�
				}
			});
		}
		return jButton7;
	}
	private JButton getJButton8() {
		if (jButton8 == null) {
			jButton8 = new JButton();
			jButton8.setText("1");
			jButton8.setFont(new Font("����", Font.BOLD, 30));
			jButton8.setForeground(new Color(250,0,0));
			jButton8.setFocusable(false);
			jButton8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str+="1";
					jTextField.setText(str);
					
				}
			});
			jButton8.addMouseListener(new MouseListener(){
				public void actionPerformed(MouseEvent e) {
					jButton8.setForeground(new Color(0,100,0));
				}
				public void mouseClicked(MouseEvent e) {
					jButton8.setForeground(new Color(0,150,100));
				}
				public void mouseEntered(MouseEvent e) {
					jButton8.setForeground(new Color(0,0,250));
				}
				public void mouseExited(MouseEvent e) {
					jButton8.setForeground(new Color(250,0,0));
				}
				public void mousePressed(MouseEvent e) {
					jButton8.setForeground(new Color(0,250,0));
				}
				public void mouseReleased(MouseEvent e) {
					jButton8.setForeground(new Color(250,250,0));
				}
			}
			);
		}
		return jButton8;
	}

	private JButton getJButton9() {
		if (jButton9 == null) {
			jButton9 = new JButton();
			jButton9.setText("7");
			jButton9.setFont(new Font("����", Font.BOLD, 30));
			jButton9.setForeground(new Color(250,0,0));
			jButton9.setFocusable(false);
			jButton9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str+="7";
					jTextField.setText(str);
				}
			});
			jButton9.addMouseListener(new MouseListener(){
				public void actionPerformed(MouseEvent e) {
					jButton9.setForeground(new Color(0,100,0));
				}
				public void mouseClicked(MouseEvent e) {
					jButton9.setForeground(new Color(0,150,100));
				}
				public void mouseEntered(MouseEvent e) {
					jButton9.setForeground(new Color(0,0,250));
				}
				public void mouseExited(MouseEvent e) {
					jButton9.setForeground(new Color(250,0,0));
				}
				public void mousePressed(MouseEvent e) {
					jButton9.setForeground(new Color(0,250,0));
				}
				public void mouseReleased(MouseEvent e) {
					jButton9.setForeground(new Color(250,250,0));
				}
			}
			);
		}
		return jButton9;
	}

	private JButton getJButton10() {
		if (jButton10 == null) {
			jButton10 = new JButton();
			jButton10.setText("8");
			jButton10.setFocusable(false);
			jButton10.setFont(new Font("����", Font.BOLD, 30));
			jButton10.setForeground(new Color(250,0,0));
			jButton10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str+="8";
					jTextField.setText(str);
				}
			});
			jButton10.addMouseListener(new MouseListener(){
				public void actionPerformed(MouseEvent e) {
					jButton10.setForeground(new Color(0,100,0));
				}
				public void mouseClicked(MouseEvent e) {
					jButton10.setForeground(new Color(0,150,100));
				}
				public void mouseEntered(MouseEvent e) {
					jButton10.setForeground(new Color(0,0,250));
				}
				public void mouseExited(MouseEvent e) {
					jButton10.setForeground(new Color(250,0,0));
				}
				public void mousePressed(MouseEvent e) {
					jButton10.setForeground(new Color(0,250,0));
				}
				public void mouseReleased(MouseEvent e) {
					jButton10.setForeground(new Color(250,250,0));
				}
			}
			);
		}
		return jButton10;
	}
	private JButton getJButton11() {
		if (jButton11 == null) {
			jButton11 = new JButton();
			jButton11.setText("2");
			jButton11.setName("2");
			jButton11.setFont(new Font("����", Font.BOLD, 30));
			jButton11.setForeground(new Color(250,0,0));
			jButton11.setFocusable(false);
			jButton11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str+="2";
					jTextField.setText(str);
				}
			});
			jButton11.addMouseListener(new MouseListener(){
				public void actionPerformed(MouseEvent e) {
					jButton11.setForeground(new Color(0,100,0));
				}
				public void mouseClicked(MouseEvent e) {
					jButton11.setForeground(new Color(0,150,100));
				}
				public void mouseEntered(MouseEvent e) {
					jButton11.setForeground(new Color(0,0,250));
				}
				public void mouseExited(MouseEvent e) {
					jButton11.setForeground(new Color(250,0,0));
				}
				public void mousePressed(MouseEvent e) {
					jButton11.setForeground(new Color(0,250,0));
				}
				public void mouseReleased(MouseEvent e) {
					jButton11.setForeground(new Color(250,250,0));
				}
			}
			);
		}
		return jButton11;
	}

	private JButton getJButton12() {
		if (jButton12 == null) {
			jButton12 = new JButton();
			jButton12.setText("3");
			jButton12.setName("3");
			jButton12.setFont(new Font("����", Font.BOLD, 30));
			jButton12.setForeground(new Color(250,0,0));
			jButton12.setFocusable(false);
			jButton12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str+="3";
					jTextField.setText(str);
				}
			});
			jButton12.addMouseListener(new MouseListener(){
				public void actionPerformed(MouseEvent e) {
					jButton12.setForeground(new Color(0,100,0));
				}
				public void mouseClicked(MouseEvent e) {
					jButton12.setForeground(new Color(0,150,100));
				}
				public void mouseEntered(MouseEvent e) {
					jButton12.setForeground(new Color(0,0,250));
				}
				public void mouseExited(MouseEvent e) {
					jButton12.setForeground(new Color(250,0,0));
				}
				public void mousePressed(MouseEvent e) {
					jButton12.setForeground(new Color(0,250,0));
				}
				public void mouseReleased(MouseEvent e) {
					jButton12.setForeground(new Color(250,250,0));
				}
			}
			);
		}
		return jButton12;
	}
	private JButton getJButton13() {//���Ű�ť
		if (jButton13 == null) {
			jButton13 = new JButton();
			jButton13.setText("-");
			jButton13.setFont(new Font("����", Font.BOLD, 30));
			jButton13.setForeground(new Color(0,150,100));
			jButton13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str=jTextField.getText();
					Operator='-';
					dataone=Double.parseDouble(str);
					str="";
					jTextField.setText(str);
				}
			});
		}
		return jButton13;
	}
	private JButton getJButton14() {//������ť
		if (jButton14 == null) {
			jButton14 = new JButton("1/x");
			jButton14.setFont(new Font("����", Font.BOLD, 30));
			jButton14.setForeground(new Color(0,0,200)); 
			jButton14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double c=Double.parseDouble(jTextField.getText());
					double d;
					if(c==0){
						jTextField.setText("�������ܵ���0");
					}else{
						d=1/c;
						jTextField.setText(Double.toString(d));
					}
				}
			});
		}
		return jButton14;
	}

	private JButton getJButton15() {
		if (jButton15 == null) {
			jButton15 = new JButton();
			jButton15.setText("0");
			jButton15.setName("0");
			jButton15.setFont(new Font("����", Font.BOLD, 30));
			jButton15.setForeground(new Color(250,0,0));
			jButton15.setFocusable(false);
			jButton15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str+="0";
					jTextField.setText(str);
				}
			});
			jButton15.addMouseListener(new MouseListener(){
				public void actionPerformed(MouseEvent e) {
					jButton15.setForeground(new Color(0,100,0));
				}
				public void mouseClicked(MouseEvent e) {
					jButton15.setForeground(new Color(0,150,100));
				}
				public void mouseEntered(MouseEvent e) {
					jButton15.setForeground(new Color(0,0,250));
				}
				public void mouseExited(MouseEvent e) {
					jButton15.setForeground(new Color(250,0,0));
				}
				public void mousePressed(MouseEvent e) {
					jButton15.setForeground(new Color(0,250,0));
				}
				public void mouseReleased(MouseEvent e) {
					jButton15.setForeground(new Color(250,250,0));
				}
			}
			);
		}
		return jButton15;
	}
	private JButton getJButton16() {
		if (jButton16 == null) {
			jButton16 = new JButton("+/-");
			jButton16.setFont(new Font("����", Font.BOLD, 30));
			jButton16.setForeground(new Color(0,0,200)); 
			jButton16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double i2=0-Double.parseDouble(jTextField.getText().trim());//+/-ʵ��
					jTextField.setText(Double.toString(i2));
				}
			});
		}
		return jButton16;
	}
	private JButton getJButton17() {//С����
		if (jButton17 == null) {
			jButton17 = new JButton();
			jButton17.setFocusable(false);
			jButton17.setText(".");
			jButton17.setFont(new Font("����", Font.BOLD, 30));
			jButton17.setForeground(new Color(33,95,95)); 
			jButton17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str+=".";
					jTextField.setText(str);
				}
			});
		}
		return jButton17;
	}
	private JButton getJButton18() {//�ӺŰ�ť
		if (jButton18 == null) {
			jButton18 = new JButton();
			jButton18.setText("+");
			jButton18.setName("+");
			jButton18.setFont(new Font("����", Font.BOLD, 30));
			jButton18.setForeground(new Color(0,150,100));
			jButton18.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str=jTextField.getText();
					Operator='+';
					dataone=Double.parseDouble(str);
					str="";
					jTextField.setText(str);
				}
			});
		}
		return jButton18;
	}
	private JButton getJButton19() {//���ںŰ�ť
		if (jButton19 == null) {
			jButton19 = new JButton();
			jButton19.setText("=");
			jButton19.setName("=");
			jButton19.setFont(new Font("����", Font.BOLD, 30));
			jButton19.setForeground(new Color(0,255,0));
			jButton19.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {//������ֵ
					double datatwo;
					datatwo=Double.parseDouble(str);
					switch(Operator){
					case'+':dataone+=datatwo;break;
					case'-':dataone-=datatwo;break;
					
					case'*':dataone*=datatwo;break;
					case'/':dataone/=datatwo;break;
					default:break;
					}
					str=Double.toString(dataone);
					jTextField.setText(str);
				}
			});
		}
		return jButton19;
	}

	private JTextField gettextMemory(){
		if (textMemory== null) {
			textMemory = new JTextField();
			textMemory.setText("WH ");
			textMemory.setFont(new Font("�����п�", Font.BOLD, 30));
			textMemory.setEditable(false);
			textMemory.setBounds(new Rectangle(5, 40, 60, 40));
			textMemory.setHorizontalAlignment(JTextField.RIGHT);
			textMemory.addActionListener(this);
		}
		return textMemory;
	}
	
	private JTextField getJTextField() {//�����ı���
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setText("");
			jTextField.setName("print");
			jTextField.setFont(new Font("����", Font.BOLD, 30));
			jTextField.setEditable(false);
			jTextField.setBounds(new Rectangle(5, 5, 575, 30));
			jTextField.setHorizontalAlignment(JTextField.RIGHT);
			jTextField.addKeyListener(new KeyAdapter() {//��ʾ������
				public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()>='0'&&e.getKeyChar()<='9'){
					str+=e.getKeyChar();
					jTextField.setText(str);
				}else if(e.getKeyChar()==KeyEvent.VK_BACK_SPACE){
					str=str.substring(0, str.length()-1);
					jTextField.setText(str);
				}else if(e.getKeyChar()==KeyEvent.VK_ESCAPE){
					str="";
					jTextField.setText(str);
				}
				}
			});
		}
		return jTextField;
	}

	private JButton getJButton20() {
		if (jButton20 == null) {
			jButton20 = new JButton();
			jButton20.setText("MC");
			jButton20.setFont(new Font("����", Font.BOLD, 25));
			jButton20.setForeground(new Color(0,150,250));
			jButton20.setBounds(new Rectangle(5, 85, 80, 40));
			jButton20.addActionListener(this);
		}
		return jButton20;
	}
	private JButton getJButton21() {
		if (jButton21 == null) {
			jButton21 = new JButton();
			jButton21.setText("MR");
			jButton21.setFont(new Font("����", Font.BOLD, 25));
			jButton21.setForeground(new Color(0,150,250));
			jButton21.setBounds(new Rectangle(5, 125, 80, 40));
			jButton21.addActionListener(this);
		}
		return jButton21;
	}
	private JButton getJButton22() {
		if (jButton22 == null) {
			jButton22 = new JButton();
			jButton22.setText("MS");
			jButton22.setFont(new Font("����", Font.BOLD, 25));
			jButton22.setForeground(new Color(0,150,250));
			jButton22.setBounds(new Rectangle(5, 165, 80, 40));
			jButton22.addActionListener(this);
		}
		return jButton22;
	}
	private JButton getJButton23() {
		if (jButton23 == null) {
			jButton23 = new JButton();
			jButton23.setText("M+");
			jButton23.setFont(new Font("����", Font.BOLD, 25));
			jButton23.setForeground(new Color(0,150,250));
			jButton23.setBounds(new Rectangle(5, 205, 80, 40));
			jButton23.addActionListener(this);
		}
		return jButton23;
	}
	private JButton getJButton24() {
		if (jButton24 == null) {
			jButton24 = new JButton();
			jButton24.setText("Backspace");//�˸��
			jButton24.setFont(new Font("����", Font.BOLD, 30));
			jButton24.setForeground(new Color(0,150,250));
			jButton24.setBounds(new Rectangle(70, 40, 195, 40));
			jButton24.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {//�˸�
					if(str.length()!=0){
						str=str.substring(0, str.length()-1);
						jTextField.setText(str);
					}
				}
			});
		}
		return jButton24;
	}
	private JButton getJButton25() {
		if (jButton25 == null) {
			jButton25 = new JButton();
			jButton25.setText("CE");
			jButton25.setFont(new Font("����", Font.BOLD, 30));
			jButton25.setForeground(new Color(0,150,250));
			jButton25.setBounds(new Rectangle(270, 40, 150, 40));
		}
		return jButton25;
	}
	private JButton getJButton26() {
		if (jButton26 == null) {
			jButton26 = new JButton();
			jButton26.setText("C");
			jButton26.setFont(new Font("����", Font.BOLD, 30));
			jButton26.setForeground(new Color(0,150,250));
			jButton26.setBounds(new Rectangle(425, 40, 155, 40));
			jButton26.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str="";
					jTextField.setText(str);
				}
			});
		}
		return jButton26;
	}
	private JMenuBar getJJMenuBar() {//�ڲ˵��������3���˵�
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getJMenu());
			jJMenuBar.add(getJMenu1());
			jJMenuBar.add(getJMenu2());
		}
		return jJMenuBar;
	}
	private JMenu getJMenu() {//�ڲ˵����༭������������˵���
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setMnemonic(KeyEvent.VK_UNDEFINED);
			jMenu.setText("�༭��E��");
			jMenu.setFont(new Font("Dialog", Font.BOLD, 12));//�����������ͺʹ�С
			jMenu.add(getJMenuItem());
			jMenu.add(getJMenuItem1());
		}
		return jMenu;
	}
	private JMenuItem getJMenuItem() {
		if (jMenuItem == null) {
			jMenuItem = new JMenuItem();
			jMenuItem.setText("���ƣ�C��Crtl+ C");//����jMenuItem����ʾ����
			jMenuItem.addActionListener(new java.awt.event.ActionListener() {//�����ı��������
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jTextField.selectAll();
					jTextField.copy();
					jTextField.select(0, 0);
					
				}
			});
		}
		return jMenuItem;
	}
	private JMenuItem getJMenuItem1() {
		if (jMenuItem1 == null) {
			jMenuItem1 = new JMenuItem();
			jMenuItem1.setText("ճ����P��Ctrl+V");//����jMenuItem1����ʾ����
			jMenuItem1.addActionListener(new ActionListener() {//�������������ճ�����ı�����
				public void actionPerformed(ActionEvent e) {
					str="";
					jTextField.setText(str);
					jTextField.setEditable(true);
					jTextField.paste();
					jTextField.setEditable(false);
					str=jTextField.getText();
				}
			});
		}
		return jMenuItem1;
	}
	private JMenu getJMenu1() {//�ڲ˵����鿴�������3���˵���
		if (jMenu1 == null) {
			jMenu1 = new JMenu();
			jMenu1.setText("�鿴��V��");
			jMenu1.add(getJMenuItem8());
			jMenu1.add(getJMenuItem4());
			jMenu1.addSeparator();
			jMenu1.add(getJMenuItem3());
			jMenu1.addSeparator();
			jMenu1.add(getJMenuItem7());
		}
		return jMenu1;
	}
	private JMenuItem getJMenuItem3() {
		if (jMenuItem3 == null) {
			jMenuItem3 = new JMenuItem();
			jMenuItem3.setText("���ɶ���I��");//����jMenuItem3����ʾ����
			jMenuItem3.addActionListener(new ActionListener() {//�򿪹��ɶ�����
				public void actionPerformed(ActionEvent e) {
					Counter.this.setVisible(false);
					new Theorem().setVisible(true);
				}
			});
		}
		return jMenuItem3;
	}
	private JMenuItem getJMenuItem7() {
		if (jMenuItem7 == null) {
			jMenuItem7 = new JMenuItem();
			jMenuItem7.setText("��һԪ���η���(G)");//����jMenuItem3����ʾ����
			jMenuItem7.addActionListener(new ActionListener() {//��һԪ���η��̴���
				public void actionPerformed(ActionEvent e) {
					Counter.this.setVisible(false);
					new Equation().setVisible(true);
				}
			});
		}
		return jMenuItem7;
	}
	private JMenuItem getJMenuItem4() {
		if (jMenuItem4 == null) {
			jMenuItem4 = new JMenuItem();
			jMenuItem4.setText("��ѧ�ͣ�S��");//����jMenuItem4����ʾ����
			jMenuItem4.addActionListener(this);
			jMenuItem4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					df=new DecimalFormat("#.###############");//����15λС��
					Counter.this.setBounds(400, 200, 600, 590);
					Counter.this.setJMenuBar(getJJMenuBar());
					Counter.this.setContentPane(getJContentPane1());//��jContentPane1�����ӵ�jFrame�����ȥ                                
					Counter.this.setTitle("�� �� �� by ���� ��ٻٻ");//���ڱ���
					Counter.this.setVisible(true);
					jTextField.addActionListener(this);
				}
			});
		}
		return jMenuItem4;
	}
	private JMenu getJMenu2() {//�ڲ˵�������������������˵���
		if (jMenu2 == null) {
			jMenu2 = new JMenu();
			jMenu2.setText("������H��");//��ʾ�˵�������
			jMenu2.add(getJMenuItem5());
			jMenu2.add(getJMenuItem6());
		}
		return jMenu2;
	}
	private JMenuItem getJMenuItem5() {
		if (jMenuItem5 == null) {
			jMenuItem5 = new JMenuItem();
			jMenuItem5.setText("�������⣨H��");//����jMenuItem5����ʾ����
			jMenuItem5.addActionListener(this);
			jMenuItem5.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					Counter.this.setVisible(true);
				    JOptionPane.showMessageDialog( null, "�����������᣿��ʾ��С�������ڼҳ����������1+1=��","������" ,1);//��ʾ������Ϣ
				}});
		}
		return jMenuItem5;
	}
	private JMenuItem getJMenuItem6() {
		if (jMenuItem6 == null) {
			jMenuItem6 = new JMenuItem();
			jMenuItem6.setText("���ڼ�������A��");//����jMenuItem6����ʾ����
			jMenuItem6.addActionListener(this);
			jMenuItem6.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					Counter.this.setVisible(true);
					JOptionPane.showMessageDialog( null, "������������ǿ�Ϳ�ѧ����������⹴�ɶ���һԪ���η��̡�\n" +
							"�����ƣ���ٻٻ������ɣ�","���ڼ�����" ,1);//������ʾ��Ϣ
					}
			});
		}
		return jMenuItem6;
	}
	private JMenuItem getJMenuItem8() {
		if (jMenuItem8 == null) {
			jMenuItem8= new JMenuItem();
			jMenuItem8.setText("��׼�ͣ�T��");//����jRadioButtonMenuItem����ʾ����
			jMenuItem8.addActionListener(this);
			jMenuItem8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Counter.this.setBounds(400, 200, 593, 310); 
				}
			});		
		}
		return jMenuItem8;
	}
	
	public Counter() {//��ʼ��һ����������
		super();
		this.setBounds(400, 200, 593, 310);     //�����С
		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(getJContentPane());//��jContentPane�����ӵ�jFrame�����ȥ
		this.setVisible(true);
		jTextField.addActionListener(this);
		this.setTitle("�� �� �� by ���� ��ٻٻ");//���ڱ���
	}
	//private void initialize() {
	//	this.setBounds(400, 200, 593, 310);     //�����С
	//	this.setJMenuBar(getJJMenuBar());
	//	this.setContentPane(getJContentPane());//��jContentPane�����ӵ�jFrame�����ȥ
	//	this.setVisible(true);
	//	jTextField.addActionListener(this);
	//}
	
	
	private JPanel getJPanel() {//����
		if (jPanel == null) {
			GridLayout gridLayout = new GridLayout();
			gridLayout.setRows(4);
			jPanel = new JPanel();
			jPanel.setName("p1");
			jPanel.setLayout(gridLayout);
			jPanel.setBounds(new Rectangle(90, 85, 490, 160));   //�ұߵİ�ť����
			jPanel.add(getJButton14(), null);
			jPanel.add(getJButton9(), null);			
			jPanel.add(getJButton10(), null);
			jPanel.add(getJButton(), null);
			jPanel.add(getJButton1(), null);
			jPanel.add(getJButton2(), null);
			jPanel.add(getJButton3(), null);
			jPanel.add(getJButton4(), null);
			jPanel.add(getJButton5(), null);
			jPanel.add(getJButton6(), null);
			jPanel.add(getJButton7(), null);
			jPanel.add(getJButton8(), null);		
			jPanel.add(getJButton11(),null);		
			jPanel.add(getJButton12(), null);
			jPanel.add(getJButton13(), null);
			jPanel.add(getJButton16(), null);
			jPanel.add(getJButton15(),null);			
			jPanel.add(getJButton17(), null);	
			jPanel.add(getJButton19(), null);
			jPanel.add(getJButton18(), null);
			
		}
		return jPanel;
	}
	
	private JPanel getJContentPane() {//����ť���ı���ȹ�����ӵ�jContentPane����ȥ
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setName("p2");
			jContentPane.add(getJPanel(), null);
			jContentPane.add(getJTextField(), null);
			jContentPane.add(gettextMemory(),null);
			jContentPane.add(getJButton20(), null);
			jContentPane.add(getJButton21(), null);
			jContentPane.add(getJButton22(), null);
			jContentPane.add(getJButton23(), null);
			jContentPane.add(getJButton24(), null);
			jContentPane.add(getJButton25(), null);
			jContentPane.add(getJButton26(), null);
			jContentPane.setVisible(true);
		}
		return jContentPane;
	}
	


//��ѧ������
	private JButton getJButton31() {
		if (jButton31 == null) {
			jButton31 = new JButton();
			jButton31.setText("ʮ������");//ʮ������
			jButton31.setFont(new Font("����", Font.BOLD, 30));
			jButton31.setForeground(new Color(0,255,128));
			jButton31.setBounds(new Rectangle(5, 40, 200, 40));
			jButton31.addActionListener(new ActionListener() {//ת��Ϊ16����
				public void actionPerformed(ActionEvent e) {
					int n=Integer.parseInt(jTextField.getText());
					String temp = Integer.toHexString(n);
					jTextField.setText(temp);
				}
			});
		}
		return jButton31;
	}
	private JButton getJButton32() {
		if (jButton32 == null) {
			jButton32 = new JButton();
			jButton32.setText("sin");//sin
			jButton32.setFont(new Font("����", Font.BOLD, 30));
			jButton32.setForeground(new Color(255,0,128));
			jButton32.setBounds(new Rectangle(5, 40, 200, 40));
			jButton32.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double i=Double.parseDouble(jTextField.getText());//��SIn
					jTextField.setText(String.valueOf(df.format(Math.sin(i))));
				}
			});
		}
		return jButton32;
	}
	private JButton getJButton33() {
		if (jButton33 == null) {
			jButton33 = new JButton();
			jButton33.setText("cos");//cos
			jButton33.setFont(new Font("����", Font.BOLD, 30));
			jButton33.setForeground(new Color(255,0,128));
			jButton33.setBounds(new Rectangle(5, 40, 200, 40));
			jButton33.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double i=Double.parseDouble(jTextField.getText());//��Cos
					jTextField.setText(String.valueOf(df.format(Math.cos(i))));
				}
			});
		}
		return jButton33;
	}
	private JButton getJButton34() {
		if (jButton34 == null) {
			jButton34 = new JButton();
			jButton34.setText("ʮ����");//ʮ����
			jButton34.setFont(new Font("����", Font.BOLD, 30));
			jButton34.setForeground(new Color(0,255,128));
			jButton34.setBounds(new Rectangle(5, 40, 200, 40));
			jButton34.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {//ת��Ϊ10����
					if(str.length()!=0){
						str=str.substring(0, str.length()-1);
						jTextField.setText(str);
					}
				}
			});
		}
		return jButton34;
	}
	private JButton getJButton35() {
		if (jButton35 == null) {
			jButton35 = new JButton();
			jButton35.setText("tan");//tan
			jButton35.setFont(new Font("����", Font.BOLD, 30));
			jButton35.setForeground(new Color(255,0,128));
			jButton35.setBounds(new Rectangle(5, 40, 200, 40));
			jButton35.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double i=Double.parseDouble(jTextField.getText());//��Tan
					jTextField.setText(String.valueOf(df.format(Math.tan(i))));
				}
			});
		}
		return jButton35;
	}
	private JButton getJButton36() {
		if (jButton36 == null) {
			jButton36 = new JButton();
			jButton36.setText("����");//����
			jButton36.setFont(new Font("����", Font.BOLD, 30));
			jButton36.setForeground(new Color(255,0,128));
			jButton36.setBounds(new Rectangle(5, 40, 200, 40));
			jButton36.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double i=Double.parseDouble(jTextField.getText());//�󻡶�
					jTextField.setText(String.valueOf(i/180*Math.PI));
				}
			});
		}
		return jButton36;
	}
	private JButton getJButton37() {
		if (jButton37 == null) {
			jButton37 = new JButton();
			jButton37.setText("�˽���");//�˽���
			jButton37.setFont(new Font("����", Font.BOLD, 30));
			jButton37.setForeground(new Color(0,255,128));
			jButton37.setBounds(new Rectangle(5, 40, 200, 40));
			jButton37.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int n=Integer.parseInt(jTextField.getText());//ת��Ϊ8����
					jTextField.setText(Integer.toOctalString(n));
				}
			});
		}
		return jButton37;
	}
	private JButton getJButton38() {
		if (jButton38 == null) {
			jButton38 = new JButton();
			jButton38.setText("x^2");//x��ƽ��
			jButton38.setFont(new Font("����", Font.BOLD, 30));
			jButton38.setForeground(new Color(0,150,250));
			jButton38.setBounds(new Rectangle(5, 40, 200, 40));
			jButton38.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {//��ƽ��
					double i=Double.parseDouble(jTextField.getText());
					jTextField.setText(String.valueOf(df.format(i*i)));
				}
			});
		}
		return jButton38;
	}
	private JButton getJButton39() {
		if (jButton39 == null) {
			jButton39 = new JButton();
			jButton39.setText("x^3");//x��3��
			jButton39.setFont(new Font("����", Font.BOLD, 30));
			jButton39.setForeground(new Color(0,150,250));
			jButton39.setBounds(new Rectangle(5, 40, 200, 40));
			jButton39.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {//�����η�
					double i=Double.parseDouble(jTextField.getText());
					jTextField.setText(String.valueOf(df.format(i*i*i)));
				}
			});
		}
		return jButton39;
	}
	private JButton getJButton40() {
		if (jButton40 == null) {
			jButton40 = new JButton();
			jButton40.setText("������");//������
			jButton40.setFont(new Font("����", Font.BOLD, 30));
			jButton40.setForeground(new Color(0,255,128));
			jButton40.setBounds(new Rectangle(5, 40, 200, 40));
			jButton40.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {//ת��Ϊ2����
						int n=Integer.parseInt(jTextField.getText());
						jTextField.setText(Integer.toBinaryString(n));
				}
			});
		}
		return jButton40;
	}
	private JButton getJButton41() {
		if (jButton41 == null) {
			jButton41 = new JButton();
			jButton41.setText("x^y");//x��y��
			jButton41.setFont(new Font("����", Font.BOLD, 30));
			jButton41.setForeground(new Color(0,150,250));
			jButton41.setBounds(new Rectangle(5, 40, 200, 40));
			jButton41.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {//��X��Y�η�
					int n1=Integer.parseInt(jTextField.getText());
					int n2=Integer.parseInt(jTextField.getText());
					for(int i=1;i<=n2;i++){
						n1=n1*n1;
					}
				}
			});
		}
		return jButton41;
	}
	private JButton getJButton42() {
		if (jButton42 == null) {
			jButton42 = new JButton();
			jButton42.setText("n!");//�׳�
			jButton42.setFont(new Font("����", Font.BOLD, 30));
			jButton42.setForeground(new Color(0,150,250));
			jButton42.setBounds(new Rectangle(5, 40, 200, 40));
			jButton42.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double i=Double.parseDouble(jTextField.getText());
					if((i%2==0)||(i%2==1)){//�ж�Ϊ�����Ž��н׳˲���			
						int j=(int)i;//ǿ������ת��
						int result=1;
						for(int k=1;k<=j;k++)
							result *=k;
						jTextField.setText(String.valueOf(result));
					}
				}
			});
		}
		return jButton42;
	}
	private JButton getJButton43() {
		if (jButton43 == null) {
			jButton43 = new JButton();
			jButton43.setText("pi");//pi
			jButton43.setFont(new Font("����", Font.BOLD, 30));
			jButton43.setForeground(new Color(0,150,250));
			jButton43.setBounds(new Rectangle(5, 40, 200, 40));
			jButton43.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					jTextField.setText(String.valueOf(Math.PI));
				}
			});
		}
		return jButton43;
	}
	private JButton getJButton44() {
		
		if (jButton44 == null) {
			jButton44 = new JButton();
			jButton44.setText("log100");//log100
			jButton44.setFont(new Font("����", Font.BOLD, 30));
			jButton44.setForeground(new Color(132,46,209));
			jButton44.setBounds(new Rectangle(5, 40, 200, 40));
			jButton44.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {//��Log100
					double i=Double.parseDouble(jTextField.getText());
					if(i>0){
						jTextField.setText(String.valueOf(df.format(Math.log(i))));
					}else{
						jTextField.setText("�������������!");
					}
				}
			});
		}
		return jButton44;
	}
	private JButton getJButton45() {
		if (jButton45 == null) {
			jButton45 = new JButton();
			jButton45.setText("	log10");//log10
			jButton45.setFont(new Font("����", Font.BOLD, 30));
			jButton45.setForeground(new Color(132,46,209));
			jButton45.setBounds(new Rectangle(5, 40, 200, 40));
			jButton45.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {//��log10
					double i=Double.parseDouble(jTextField.getText());
					if(i>0){
						jTextField.setText(String.valueOf(df.format(Math.log10(i))));
					}else{
						jTextField.setText("�������������!");
					}
				}
			});
		}
		return jButton45;
	}
	private JButton getJButton46() {
		if (jButton46 == null) {
			jButton46 = new JButton();
			jButton46.setText("	A");//A
			jButton46.setFont(new Font("����", Font.BOLD, 30));
			jButton46.setForeground(new Color(0,255,128));
			jButton46.setBounds(new Rectangle(5, 40, 200, 40));
			jButton46.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str+="A";
					jTextField.setText(str);
				}
			});
		}
		return jButton46;
	}
	private JButton getJButton47() {
		if (jButton47 == null) {
			jButton47 = new JButton();
			jButton47.setText("B");//B
			jButton47.setFont(new Font("����", Font.BOLD, 30));
			jButton47.setForeground(new Color(0,255,128));
			jButton47.setBounds(new Rectangle(5, 40, 200, 40));
			jButton47.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str+="B";
					jTextField.setText(str);
				}
			});
		}
		return jButton47;
	}
	private JButton getJButton48() {
		if (jButton48 == null) {
			jButton48 = new JButton();
			jButton48.setText("C");//C
			jButton48.setFont(new Font("����", Font.BOLD, 30));
			jButton48.setForeground(new Color(0,255,128));
			jButton48.setBounds(new Rectangle(5, 40, 200, 40));
			jButton48.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str+="C";
					jTextField.setText(str);
				}
			});
		}
		return jButton48;
	}
	private JButton getJButton49() {
		if (jButton49 == null) {
			jButton49 = new JButton();
			jButton49.setText("D");//D
			jButton49.setFont(new Font("����", Font.BOLD, 30));
			jButton49.setForeground(new Color(0,255,128));
			jButton49.setBounds(new Rectangle(5, 40, 200, 40));
			jButton49.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str+="D";
					jTextField.setText(str);
				}
			});
		}
		return jButton49;
	}
	private JButton getJButton50() {
		if (jButton50 == null) {
			jButton50 = new JButton();
			jButton50.setText("E");//E
			jButton50.setFont(new Font("����", Font.BOLD, 30));
			jButton50.setForeground(new Color(0,255,128));
			jButton50.setBounds(new Rectangle(5, 40, 200, 40));
			jButton50.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str+="E";
					jTextField.setText(str);
				}
			});
		}
		return jButton50;
	}
	private JButton getJButton51() {
		if (jButton51 == null) {
			jButton51 = new JButton();
			jButton51.setText("F");//F
			jButton51.setFont(new Font("����", Font.BOLD, 30));
			jButton51.setForeground(new Color(0,255,128));
			jButton51.setBounds(new Rectangle(5, 40, 200, 40));
			jButton51.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					str+="F";
					jTextField.setText(str);
				}
			});
		}
		return jButton51;
	}
	private JPanel getJPanel1() {//����
		if (jPanel1== null) {
			GridLayout gridLayout = new GridLayout();
			gridLayout.setRows(7);
			jPanel1 = new JPanel();
			jPanel1.setLayout(gridLayout);
			jPanel1.setBounds(new Rectangle(5, 250, 576, 280));   //�ұߵİ�ť����
			jPanel1.add(getJButton31(), null);
			jPanel1.add(getJButton32(), null);
			jPanel1.add(getJButton33(), null);
			jPanel1.add(getJButton34(), null);
			jPanel1.add(getJButton35(), null);
			jPanel1.add(getJButton36(), null);
			jPanel1.add(getJButton37(), null);
			jPanel1.add(getJButton38(), null);
			jPanel1.add(getJButton39(), null);
			jPanel1.add(getJButton40(), null);
			jPanel1.add(getJButton41(), null);
			jPanel1.add(getJButton42(), null);
			jPanel1.add(getJButton43(), null);
			jPanel1.add(getJButton44(), null);
			jPanel1.add(getJButton45(), null);
			jPanel1.add(getJButton46(), null);
			jPanel1.add(getJButton47(), null);
			jPanel1.add(getJButton48(), null);
			jPanel1.add(getJButton49(), null);
			jPanel1.add(getJButton50(), null);
			jPanel1.add(getJButton51(), null);	
		}
		return jPanel1;
	}
	
	private JPanel getJContentPane1() {//����ť���ı���ȹ�����ӵ�jContentPane����ȥ
		if (jContentPane1 == null) {
			jContentPane1 = new JPanel();
			jContentPane1.add(getJPanel(), null);
			jContentPane1.setLayout(null);
			jContentPane1.add(getJTextField(), null);
			jContentPane1.add(gettextMemory(),null);
			jContentPane1.add(getJButton20(), null);
			jContentPane1.add(getJButton21(), null);
			jContentPane1.add(getJButton22(), null);
			jContentPane1.add(getJButton23(), null);
			jContentPane1.add(getJButton24(), null);
			jContentPane1.add(getJButton25(), null);
			jContentPane1.add(getJButton26(), null);
			jContentPane1.add(getJPanel1(), null);
			jContentPane1.setVisible(true);
		}
		return jContentPane1;
	}
	public void actionPerformed(ActionEvent e) {
		Object temp = e.getSource();
		if (temp == jButton20) {
	        memoryd = memoryi = 0;
	        textMemory.setText("ZY ");
	        textMemory.setFont(new Font("�����п�", Font.BOLD, 30));
	      }
	      //'MS'�Ĳ���������ǰ�ı������ݱ������ڴ棬��ʾ'M'
	      if (temp == jButton22) {   //textMemory��ʾm���ı���
	        boolean isDot = false;
	        textMemory.setText(" M  ");
	        textMemory.setFont(new Font("����", Font.BOLD, 30));
	        for (int i = 0; i < jTextField.getText().length(); i++)
	          if ('.' == jTextField.getText().charAt(i)) {
	            isDot = true;
	            break;
	          }
	        //�����double,�����memoryd(double�洢��)
	        if (isDot == true) {
	          memoryd = Double.parseDouble(jTextField.getText());
	          memoryi = 0; //��֤�洢���д�����µ�ֵ
	        }
	        //�����int,�����memoryi(int�洢��)
	        else {
	          memoryi = Integer.parseInt(jTextField.getText());
	          memoryd = 0; //��֤�洢���д�����µ�ֵ
	        }
	      }
	      //'MR'�Ĳ��������洢���е���Ϣ���
	      if (temp == jButton21) {
	        if (memoryd != 0)
	        	jTextField.setText(Double.toString(memoryd));
	        if (memoryi != 0)
	        	jTextField.setText(Integer.toString(memoryi));
	      }
	      //'M+'�Ĺ��ܣ�����ǰ�ı���������ݺʹ洢����������Ӻ��ٴ���洢��
	      if (temp == jButton23) {
	    	  textMemory.setText(" M  ");
	    	  textMemory.setFont(new Font("����", Font.BOLD, 30));
	    	  boolean isDot = false;
	    	  for (int i = 0; i < jTextField.getText().length(); i++)
	          if ('.' == jTextField.getText().charAt(i)) {
	        	  isDot = true;
	        	  break;
	          }
	    	  if (memoryi != 0) { //�洢����һ��int����
	          if (isDot == false) //��������һ��int����
	            memoryi += Integer.parseInt(jTextField.getText());
	          else { //��������һ��double��������int�洢����������double�洢���뵱ǰ����ӣ�int�洢������
	            memoryd = memoryi + Double.parseDouble(jTextField.getText());
	            memoryi = 0;
	          }
	        }
	        else
	          memoryd += Double.parseDouble(jTextField.getText());
	      }
	}
}  
//���ɶ���
class Theorem extends JFrame implements ActionListener{
	private JMenuBar myBar1;
	private JMenu menu1;
	private JMenuItem seeItem1;
	private JTextField jtf11,jtf12,jtf13;
	private JButton jb11,jb12,jb13;
	private JPanel jp11,jp12;
	DecimalFormat df=new DecimalFormat("#.####");//����4λС��
	Theorem(){
		super("���ɶ���");
		myBar1=new JMenuBar();
		menu1=new JMenu("�鿴");
		menu1.setFont(new Font("�����п�", Font.BOLD, 30));
		seeItem1=new JMenuItem("��׼������");
		seeItem1.addActionListener(this);
		seeItem1.setFont(new Font("�����п�", Font.BOLD, 20));
		menu1.add(seeItem1);
		myBar1.add(menu1);
		jp12=new JPanel();
		jp12.add(myBar1);
		jb11=new JButton("ֱ�Ǳ�a");
		jb11.setName("a");
		jb12=new JButton("ֱ�Ǳ�b");
		jb12.setName("b");
		jb13=new JButton("ֱ�Ǳ�c");
		jb13.setName("c");
		jb11.setFont(new Font("����", Font.BOLD, 20));
		jb12.setFont(new Font("����", Font.BOLD, 20));
		jb13.setFont(new Font("����", Font.BOLD, 20));
		jb13.addActionListener(this);
		jb11.addActionListener(this);
		jb12.addActionListener(this);
		jtf11=new JTextField(5);
		jtf11.setFont(new Font("�����п�", Font.BOLD, 30));
		jtf11.addActionListener(this);
		jtf11.setName("aa");
		jtf12=new JTextField(5);
		jtf12.setFont(new Font("�����п�", Font.BOLD, 30));
		jtf12.addActionListener(this);
		jtf12.setName("bb");
		jtf13=new JTextField(5);
		jtf13.setFont(new Font("�����п�", Font.BOLD, 30));
		jtf13.addActionListener(this);
		jtf13.setName("cc");
		jp11=new JPanel();
		jp11.add(jb11);jp11.add(jtf11);jp11.add(jb12);
		jp11.add(jtf12);jp11.add(jb13);jp11.add(jtf13);
		this.setBounds(300,200,700,150);
		this.setLayout(new GridLayout(2,0));
		this.add(jp12);this.add(jp11);

//		���ô���֮���л�	
		seeItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Theorem.this.setVisible(false);
				new Counter().setVisible(true);}});}

	public void actionPerformed(ActionEvent e) {//�󹴹ɶ���
		try{		
			if (e.getSource()==jb13){
				double a=Double.parseDouble(jtf11.getText());
				double b=Double.parseDouble(jtf12.getText());
				double d,d2;
				d=a*a+b*b;
				d2=Math.sqrt(d);
				jtf13.setText(String.valueOf(df.format(d2)));}		
			if (e.getSource()==jb12){
				double a=Double.parseDouble(jtf11.getText());
				double b=Double.parseDouble(jtf13.getText());
				double d,d2;
				d=b*b-a*a;
				d2=Math.sqrt(d);
				jtf12.setText(String.valueOf(df.format(d2)));}	
			if (e.getSource()==jb11){
				double a=Double.parseDouble(jtf12.getText());
				double b=Double.parseDouble(jtf13.getText());
				double d,d2;
				d=b*b-a*a;
				d2=Math.sqrt(d);
				jtf11.setText(String.valueOf(df.format(d2)));}
	}catch(Exception ex){
		JOptionPane.showMessageDialog( null, "�����������������룡","��ʾ" ,2);
	}
	}
}
//һԪ���η���
class Equation extends JFrame implements ActionListener {
	private JMenuBar myBar1;
	private JMenu menu1;
	private JMenuItem seeItem2,seeItem3;
	private JLabel jl1,jl2,jl3;
	private JTextField jtf1,jtf2,jtf3,jtf4,jtf5;
	private JButton jb1,jb2,jb3;
	private JPanel jp1,jp2,jp3;
	public Equation(){
		super("��һԪ���η��̽��");
		myBar1=new JMenuBar();
		menu1=new JMenu("�鿴");
		menu1.setFont(new Font("�����п�", Font.BOLD, 30));
		seeItem2=new JMenuItem("��׼������");
		seeItem2.addActionListener(this);
		seeItem2.setFont(new Font("�����п�", Font.BOLD, 20));
		seeItem3=new JMenuItem("���ɶ���");
		seeItem3.addActionListener(this);
		seeItem3.setFont(new Font("�����п�", Font.BOLD, 20));
		menu1.add(seeItem2);
		menu1.add(seeItem3);
		myBar1.add(menu1);
		jp3=new JPanel();
		jp3.add(myBar1);
		jl1=new JLabel("a=");
		jl2=new JLabel("b=");
		jl3=new JLabel("c=");
		jl1.setFont(new Font("����", Font.BOLD, 30));
		jl2.setFont(new Font("����", Font.BOLD, 30));
		jl3.setFont(new Font("����", Font.BOLD, 30));
		jtf1=new JTextField(10);
		jtf1.setFont(new Font("�����п�", Font.BOLD, 30));
		jtf1.addActionListener(this);
		jtf1.setName("a=");
		jtf2=new JTextField(10);
		jtf2.setFont(new Font("�����п�", Font.BOLD, 30));
		jtf2.addActionListener(this);
		jtf2.setName("b=");
		jtf3=new JTextField(10);
		jtf3.setFont(new Font("�����п�", Font.BOLD, 30));
		jtf3.addActionListener(this);
		jtf3.setName("c=");
		jb1=new JButton("X1=");
		jb1.setFont(new Font("�����п�", Font.BOLD, 25));
		jb1.setName("x1");
		jb1.addActionListener(this);
		jtf4=new JTextField(11);
		jtf4.setFont(new Font("�����п�", Font.BOLD, 30));
		jtf4.addActionListener(this);
		jtf4.setName("output");
		jb2=new JButton("X2=");
		jb2.setName("x2");
		jb2.setFont(new Font("�����п�", Font.BOLD, 25));
		jb2.addActionListener(this);
		jtf5=new JTextField(11);
		jtf5.setFont(new Font("�����п�", Font.BOLD, 30));
		jtf5.addActionListener(this);
		jtf5.setName("output1");
		jb3=new JButton("���");
		jb3.setFont(new Font("�����п�", Font.BOLD, 25));
		jb3.addActionListener(this);
		jp1=new JPanel();
	jp1.add(jl1);jp1.add(jtf1);jp1.add(jl2);jp1.add(jtf2);jp1.add(jl3);jp1.add(jtf3);jp1.add(jtf4);
		jp2=new JPanel();
	jp2.add(jb1);jp2.add(jtf4);jp2.add(jb2);jp2.add(jtf5);jp2.add(jb3);
		this.setBounds(300,200,740,200);
		this.setLayout(new GridLayout(3,0));
		this.add(jp3);this.add(jp1);this.add(jp2);

	  this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
		}
		);	
//���ô���֮���л�	
		
		seeItem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Equation.this.setVisible(false);
				new Counter().setVisible(true);
			}
		});
		
		seeItem3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Equation.this.setVisible(false);
				new Theorem().setVisible(true);
			}
		});
		
		
	}

	public void actionPerformed(ActionEvent e) {	//��һԪ���η���
		
		double a=Double.parseDouble(jtf1.getText());
		double b=Double.parseDouble(jtf2.getText());
		double c=Double.parseDouble(jtf3.getText());
		double d,x1,x2;
		d=b*b-4*a*c;
		x1=(-1*b+Math.sqrt(d))/(2*a);
		x2=(-1*b-Math.sqrt(d))/(2*a);
		if(e.getSource()==jb1&&d<0){
			jtf4.setText("dС��0�޽�");
			jtf5.setText("dС��0�޽�");
		}
		else if(e.getSource()==jb1&&d>=0){
			jtf4.setText(Double.toString(x1));
			jtf5.setText(Double.toString(x2));
		}
		else if(e.getSource()==jb3){
			jtf1.setText("");
			jtf2.setText("");
			jtf3.setText("");
			jtf4.setText("");
			jtf5.setText("");
		}
	}
}
			
