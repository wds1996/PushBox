package test;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.ForkJoinWorkerThread;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Mainframe extends Frame implements KeyListener {
	int[][][] datas = {{ { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
						 { 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0 },
						 { 0, 0, 0, 0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0 },
						 { 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0 },
						 { 0, 0, 0, 0, 1, 1, 1, 4, 0, 4, 3, 1, 0, 0, 0, 0 },
						 { 0, 0, 0, 0, 1, 3, 0, 4, 6, 1, 1, 1, 0, 0, 0, 0 },
						 { 0, 0, 0, 0, 1, 1, 1, 1, 4, 1, 0, 0, 0, 0, 0, 0 },
						 { 0, 0, 0, 0, 0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0 },
						 { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0 },
						 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
						 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }},
					   { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 1, 0, 3, 3, 4, 0, 1, 0, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 1, 0, 0, 4, 0, 0, 1, 0, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 1, 0, 4, 6, 1, 0, 1, 0, 0, 0, 0 },
					  	 { 0, 0, 0, 0, 0, 1, 3, 4, 0, 0, 0, 1, 0, 0, 0, 0 },
					  	 { 0, 0, 0, 0, 0, 1, 3, 1, 1, 1, 1, 1, 0, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }},
					   { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 6, 1, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0 },
					  	 { 0, 0, 0, 0, 0, 1, 4, 0, 4, 0, 4, 0, 1, 0, 0, 0 },
					  	 { 0, 0, 0, 0, 0, 1, 0, 4, 1, 1, 0, 0, 1, 0, 0, 0 },
					 	 { 0, 0, 0, 1, 1, 1, 0, 4, 0, 1, 0, 1, 1, 0, 0, 0 },
					 	 { 0, 0, 0, 1, 3, 3, 3, 3, 3, 0, 0, 1, 0, 0, 0, 0 },
					     { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }},
					   { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		 				 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
		 				 { 0, 0, 0, 0, 0 ,0 ,0 ,0 ,1 ,1 ,1 ,1 ,1 ,0 ,0, 0 },
		 				 { 0, 0, 0, 0, 1, 1, 1, 1, 1, 0 ,0, 0 ,1 ,0, 0, 0 },
		 				 { 0, 0, 0, 0 ,1 ,0 ,0 ,0 ,0 ,4 ,1 ,0 ,1 ,0, 0, 0 },
		 				 { 0, 0, 0 ,0 ,1 ,0 ,1 ,0 ,3 ,0 ,0 ,0 ,1 ,0, 0, 0 },
		 				 { 0, 0, 0, 1 ,1 ,0 ,3 ,0 ,1 ,4 ,0 ,1 ,1 ,0, 0, 0 },
		 				 { 0, 0, 0, 1 ,0 ,4 ,0 ,0 ,3 ,0 ,0 ,0 ,1 ,0, 0, 0 },
		 				 { 0, 0, 0, 1 ,0 ,0 ,0 ,1 ,1 ,0 ,6 ,0 ,1 ,0, 0, 0 },
		 				 { 0, 0, 0, 1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,0 ,0, 0 },
		 				 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
		 				 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }},
					   { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			 			 { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			 			 { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1 },
			 			 { 1, 0, 1, 0, 0, 0, 1, 4, 0, 0, 0, 0, 1, 0, 0, 1 },
			 			 { 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 3, 1 },
			 			 { 1, 0, 1, 0, 1, 0, 0, 4, 0, 1, 1, 1, 1, 0, 3, 1 },
			 			 { 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 3, 1 },
			 			 { 1, 0, 1, 0, 0, 0, 0, 4, 0, 0, 0, 0, 1, 0, 0, 1 },
			 			 { 1, 0, 1, 6, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1 },
			 			 { 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			 			 { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			 			 { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }},
					   { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					     { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 },
					     { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 },
					     { 0, 0, 0, 0, 1, 1, 3, 0, 3, 0, 3, 1, 1, 0, 0, 0 },
					     { 0, 0, 0, 0, 1, 1, 0, 4, 4, 4, 0, 1, 1, 0, 0, 0 },
					  	 { 0, 0, 0, 0, 1, 1, 3, 4, 6, 4, 3, 1, 1, 0, 0, 0 },
					  	 { 0, 0, 0, 0, 1, 1, 0, 4, 4, 4, 0, 1, 1 ,0, 0, 0 },
					 	 { 0, 0, 0, 0, 1, 1, 3, 0, 3, 0, 3, 1, 1, 0, 0, 0 },
					 	 { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 },
					     { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
					     { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }},
		 			   { { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 },
				 		 { 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0 },
				 		 { 0, 0, 1, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				 		 { 0, 0, 1, 1, 4, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0 },
				 		 { 0, 0, 1, 0, 0, 1, 1, 0, 7, 0, 1, 0, 1, 1, 0, 0 },
				 		 { 0, 0, 1, 0, 4, 3, 3, 3, 3, 3, 3, 0, 1, 0, 0, 0 },
				 		 { 0, 1, 1, 0, 1, 1, 1, 0, 3, 0, 1, 0, 1, 0, 0, 0 },
				 		 { 0, 1, 0, 0, 0, 0, 0, 4, 1, 1, 1, 4, 1, 0, 0, 0 },
				 		 { 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 4, 6, 1, 0, 0, 0 },
				 		 { 0, 1, 1, 1, 1, 1, 4, 1, 0, 1, 1, 1, 1, 0, 0, 0 },
				 		 { 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, 
				 		 { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0 }}};
	// 场景数据模拟，即障碍物模拟，用二维数组模拟
		// 1代表障碍，0代表空地,3代表目标，4代表箱子，7代表箱子与目标重合
		int rx;// 人物横向位置
		int ry;// 人物纵向位置
		int num ;// 代表有几个箱子
		int count = 0;// 代表当前有几个箱子在目标位置
		// 由于当前操作组件是JLable，JLable现在无法判断到底在什么位置
		// 设定一个与数据存储对应着的JLable存储数组
		JLabel[][] xiangzi = new JLabel[12][16];
	int p;
	public Mainframe(int p) {
		for (int i = 0; i < datas[p].length; i++) {
			for (int j = 0; j < datas[p][i].length; j++) {
				if (datas[p][i][j]==4) {
					num++;
				}
			}
		}
		this.p=p;
		// 添加人物，初始化
		renInit();
		// 地图初始化
		dituInit();
		// 添加背景，初始化
		backgroundInit();
		// 设置主窗体
		setMainFrameUI();
		// 使窗口监听用户是不是点了键盘
		this.addKeyListener(this);
	}
	//胜利条件
	private void victory() {
		if (count==num) {
			if (p==datas.length-1) {
				JOptionPane.showConfirmDialog(null, "恭喜你完成全部关卡，点击退出！╮(╯▽╰)╭", "推箱子",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
			int retval =JOptionPane.showConfirmDialog(null, "恭喜你过关了！╮(╯▽╰)╭，是否进入下一关", "推箱子",
					JOptionPane.INFORMATION_MESSAGE);
			if (retval == JOptionPane.YES_NO_OPTION) {
				this.dispose();
				new Mainframe(p+1).addWindowListener(new WindowAdapter()
				{
					   public void windowClosing(WindowEvent e)
					   {
					       System.exit(0);
					   }
							}
					   ); 
			}else {
				System.exit(0);
			}
		}		
	}
	// 障碍初始化
	private void dituInit() {
		// 初始化地图
		Icon ic = new ImageIcon("qiang1.png");
		Icon im = new ImageIcon("mudidi.png");
		Icon ix = new ImageIcon("xiangzi-op.png");
		Icon ix2 = new ImageIcon("xiangzi-end.png");
		for (int i = 0; i < datas[p].length; i++) {
			for (int j = 0; j < datas[p][i].length; j++) {
				JLabel lab_xiangzi = new JLabel(ix);
				lab_xiangzi.setBounds(4 + j * 50, 30 + i * 50, 50, 50);
				if (datas[p][i][j] == 4) {
					xiangzi[i][j] = lab_xiangzi;
					this.add(lab_xiangzi);
				}
			}
		}
		for (int i = 0; i < datas[p].length; i++) {
			for (int j = 0; j < datas[p][i].length; j++) {
				JLabel lab_mubiao = new JLabel(im);
				lab_mubiao.setBounds(4 + j * 50, 30 + i * 50, 50, 50);
				JLabel lab_xiangzi2 = new JLabel(ix2);
				lab_xiangzi2.setBounds(4 + j * 50, 30 + i * 50, 50, 50);
				if (datas[p][i][j] == 7) {
					xiangzi[i][j] = lab_xiangzi2;				
					this.add(lab_xiangzi2);
					this.add(lab_mubiao);
				}
			}
		}
		for (int i = 0; i < datas[p].length; i++) {
			for (int j = 0; j < datas[p][i].length; j++) {
				JLabel lab_mubiao = new JLabel(im);
				lab_mubiao.setBounds(4 + j * 50, 30 + i * 50, 50, 50);
				if (datas[p][i][j] == 3) {
					this.add(lab_mubiao);
				}
			}
		}
		for (int i = 0; i < datas[p].length; i++) {
			for (int j = 0; j < datas[p][i].length; j++) {
				JLabel lab_qiang = new JLabel(ic);
				lab_qiang.setBounds(4 + j * 50, 30 + i * 50, 50, 50);
				if (datas[p][i][j] == 1) {
					this.add(lab_qiang);
				}
			}
		}
	}
	public void renInit() {
		// 人物初始位置
		for (int i = 0; i < datas[p].length; i++) {
			for (int j = 0; j < datas[p][i].length; j++) {
				if (datas[p][i][j]==6) {
					datas[p][i][j]=0;
					rx = j;
					ry = i;
				}
			}
		}
//		rx = 3;
//		ry = 8;
		// 创建一个图片人物对象
		Icon i = new ImageIcon("ren-zheng.png");
		// 使用JLable制作人物
		lab_ren = new JLabel(i);
		// 设置人物显示的位置和大小
		lab_ren.setBounds(rx * 50 + 4, ry * 50 + 30, 50, 50);
		// 将人物添加到窗体里
		this.add(lab_ren);
	}
	JLabel lab_ren;
	// 背景初始化，使用JLable
	private void backgroundInit() {
		// 创建一个图片背景对象
		Icon i = new ImageIcon("bg2.jpg");
		// 使用JLable制作背景
		JLabel lab_bg = new JLabel(i);
		// 设置背景显示的位置和大小
		lab_bg.setBounds(8, 31, 800, 600);
		// 将背景添加到窗体里
		this.add(lab_bg);
	}
	// 窗体初始化
	public void setMainFrameUI() {
		this.setLayout(null);// 设置窗体自由布局
		this.setSize(809, 637);// 设置窗口大小
		this.setLocationRelativeTo(null);// 设置窗口显示位置
		this.setTitle("推箱子   v2.0");// 设置标题
		this.setVisible(true);// 显示窗口
	}
	public void keyTyped(KeyEvent e) {
		// 点击键盘的监听和相关操作
	}
	public void keyPressed(KeyEvent e) {
		// 松开键盘的键盘和相关操作
		// 如何区分用户是点击的哪一个按键?
		// 通过键码值区分是哪一个按键
		// 获取键码值的方法system.out.println(e.getKeyCode());
		int key = e.getKeyCode();
		// key代表你输入的按键
		// 左37 上38 右39 下40
		// 首先需要知道人物现在的位置
		int x = (int) lab_ren.getLocation().getX();
		int y = (int) lab_ren.getLocation().getY();
		if (key == 38) {
			// 让人物向上移动
			// 不同方向的图片更新
			Icon i = new ImageIcon("ren-fan.png");
			lab_ren.setIcon(i);
			if (datas[p][ry - 1][rx] == 0) {
				lab_ren.setLocation(x, y - 50);
				ry = ry - 1;
				return;
			}
			if (datas[p][ry - 1][rx] == 3) {
				lab_ren.setLocation(x, y - 50);
				ry = ry - 1;
				return;
			}
			if (datas[p][ry - 1][rx] == 1) {
				return;
			}
			if (datas[p][ry - 1][rx] == 4 && datas[p][ry - 2][rx] == 1) {
				return;
			}
			if (datas[p][ry - 1][rx] == 4 && datas[p][ry - 2][rx] == 4) {
				return;
			}
			if (datas[p][ry - 1][rx] == 4 && datas[p][ry - 2][rx] == 7) {
				return;
			}
			if (datas[p][ry - 1][rx] == 7 && datas[p][ry - 2][rx] == 4) {
				return;
			}
			if (datas[p][ry - 1][rx] == 7 && datas[p][ry - 2][rx] == 1) {
				return;
			}
			if (datas[p][ry - 1][rx] == 7 && datas[p][ry - 2][rx] == 7) {
				return;
			}
			if (datas[p][ry - 1][rx] == 4 && datas[p][ry - 2][rx] == 0) {
				datas[p][ry - 1][rx] = 0;
				datas[p][ry - 2][rx] = 4;
			}
			if (datas[p][ry - 1][rx] == 4 && datas[p][ry - 2][rx] == 3) {
				datas[p][ry - 1][rx] = 0;
				datas[p][ry - 2][rx] = 7;
				Icon im = new ImageIcon("xiangzi-end.png");
				xiangzi[ry - 1][rx].setIcon(im);
				count++;
			}
			if (datas[p][ry - 1][rx] == 7 && datas[p][ry - 2][rx] == 0) {
				datas[p][ry - 1][rx] = 3;
				datas[p][ry - 2][rx] = 4;
				Icon im = new ImageIcon("xiangzi-op.png");
				xiangzi[ry - 1][rx].setIcon(im);
				count--;
			}
			if (datas[p][ry - 1][rx] == 7 && datas[p][ry - 2][rx] == 3) {
				datas[p][ry - 1][rx] = 3;
				datas[p][ry - 2][rx] = 7;
			}
			xiangzi[ry - 1][rx].setLocation(rx * 50 + 4, ry * 50 + 30 - 100);
			xiangzi[ry - 2][rx] = xiangzi[ry - 1][rx];
			xiangzi[ry - 1][rx] = null;
			lab_ren.setLocation(x, y - 50);
			ry = ry - 1;
			victory();
			return;
		}
		if (key == 37) {
			Icon i = new ImageIcon("ren-zuo.png");
			lab_ren.setIcon(i);
			if (datas[p][ry][rx - 1] == 0) {
				lab_ren.setLocation(x - 50, y);
				rx = rx - 1;
				return;
			}
			if (datas[p][ry][rx - 1] == 3) {
				lab_ren.setLocation(x - 50, y);
				rx = rx - 1;
				return;
			}
			if (datas[p][ry][rx - 1] == 1) {
				return;
			}
			if (datas[p][ry][rx - 1] == 4 && datas[p][ry][rx - 2] == 1) {
				return;
			}
			if (datas[p][ry][rx - 1] == 4 && datas[p][ry][rx - 2] == 4) {
				return;
			}
			if (datas[p][ry][rx - 1] == 4 && datas[p][ry][rx - 2] == 7) {
				return;
			}
			if (datas[p][ry][rx - 1] == 7 && datas[p][ry][rx - 2] == 4) {
				return;
			}
			if (datas[p][ry][rx - 1] == 7 && datas[p][ry][rx - 2] == 1) {
				return;
			}
			if (datas[p][ry][rx - 1] == 7 && datas[p][ry][rx - 2] == 7) {
				return;
			}
			if (datas[p][ry][rx - 1] == 4 && datas[p][ry][rx - 2] == 0) {
				datas[p][ry][rx - 1] = 0;
				datas[p][ry][rx - 2] = 4;
			}
			if (datas[p][ry][rx - 1] == 4 && datas[p][ry][rx - 2] == 3) {
				datas[p][ry][rx - 1] = 0;
				datas[p][ry][rx - 2] = 7;
				Icon im = new ImageIcon("xiangzi-end.png");
				xiangzi[ry][rx - 1].setIcon(im);
				count++;
			}
			if (datas[p][ry][rx - 1] == 7 && datas[p][ry][rx - 2] == 0) {
				datas[p][ry][rx - 1] = 3;
				datas[p][ry][rx - 2] = 4;
				Icon im = new ImageIcon("xiangzi-op.png");
				xiangzi[ry][rx - 1].setIcon(im);
				count--;
			}
			if (datas[p][ry][rx - 1] == 7 && datas[p][ry][rx - 2] == 3) {
				datas[p][ry][rx - 1] = 3;
				datas[p][ry][rx - 2] = 7;
			}
			xiangzi[ry][rx - 1].setLocation(rx * 50 + 4 - 100, ry * 50 + 30);
			xiangzi[ry][rx - 2] = xiangzi[ry][rx - 1];
			xiangzi[ry][rx - 1] = null;
			lab_ren.setLocation(x - 50, y);
			rx = rx - 1;
			victory();
			return;
		}
		if (key == 40) {
			Icon i = new ImageIcon("ren-zheng.png");
			lab_ren.setIcon(i);
			if (datas[p][ry + 1][rx] == 0) {
				lab_ren.setLocation(x, y + 50);
				ry = ry + 1;
				return;
			}
			if (datas[p][ry + 1][rx] == 3) {
				lab_ren.setLocation(x, y + 50);
				ry = ry + 1;
				return;
			}
			if (datas[p][ry + 1][rx] == 1) {
				return;
			}
			if (datas[p][ry + 1][rx] == 4 && datas[p][ry + 2][rx] == 1) {
				return;
			}
			if (datas[p][ry + 1][rx] == 4 && datas[p][ry + 2][rx] == 4) {
				return;
			}
			if (datas[p][ry + 1][rx] == 4 && datas[p][ry + 2][rx] == 7) {
				return;
			}
			if (datas[p][ry + 1][rx] == 7 && datas[p][ry + 2][rx] == 4) {
				return;
			}
			if (datas[p][ry + 1][rx] == 7 && datas[p][ry + 2][rx] == 1) {
				return;
			}
			if (datas[p][ry + 1][rx] == 7 && datas[p][ry + 2][rx] == 7) {
				return;
			}
			if (datas[p][ry + 1][rx] == 4 && datas[p][ry + 2][rx] == 0) {
				datas[p][ry + 1][rx] = 0;
				datas[p][ry + 2][rx] = 4;
			}
			if (datas[p][ry + 1][rx] == 4 && datas[p][ry + 2][rx] == 3) {
				datas[p][ry + 1][rx] = 0;
				datas[p][ry + 2][rx] = 7;
				Icon im = new ImageIcon("xiangzi-end.png");
				xiangzi[ry + 1][rx].setIcon(im);
				count++;
			}
			if (datas[p][ry + 1][rx] == 7 && datas[p][ry + 2][rx] == 0) {
				datas[p][ry + 1][rx] = 3;
				datas[p][ry + 2][rx] = 4;
				Icon im = new ImageIcon("xiangzi-op.png");
				xiangzi[ry + 1][rx].setIcon(im);
				count--;
			}
			if (datas[p][ry + 1][rx] == 7 && datas[p][ry + 2][rx] == 3) {
				datas[p][ry + 1][rx] = 3;
				datas[p][ry + 2][rx] = 7;
			}
			xiangzi[ry + 1][rx].setLocation(rx * 50 + 4, ry * 50 + 30 + 100);
			xiangzi[ry + 2][rx] = xiangzi[ry + 1][rx];
			xiangzi[ry + 1][rx] = null;
			lab_ren.setLocation(x, y + 50);
			ry = ry + 1;
			victory();
			return;
		}
		if (key == 39) {
			Icon i = new ImageIcon("ren-you.png");
			lab_ren.setIcon(i);
			if (datas[p][ry][rx + 1] == 0) {
				lab_ren.setLocation(x + 50, y);
				rx = rx + 1;
				return;
			}
			if (datas[p][ry][rx + 1] == 3) {
				lab_ren.setLocation(x + 50, y);
				rx = rx + 1;
				return;
			}
			if (datas[p][ry][rx + 1] == 1) {
				return;
			}
			if (datas[p][ry][rx + 1] == 4 && datas[p][ry][rx + 2] == 1) {
				return;
			}
			if (datas[p][ry][rx + 1] == 4 && datas[p][ry][rx + 2] == 4) {
				return;
			}
			if (datas[p][ry][rx + 1] == 4 && datas[p][ry][rx + 2] == 7) {
				return;
			}
			if (datas[p][ry][rx + 1] == 7 && datas[p][ry][rx + 2] == 4) {
				return;
			}
			if (datas[p][ry][rx + 1] == 7 && datas[p][ry][rx + 2] == 1) {
				return;
			}
			if (datas[p][ry][rx + 1] == 7 && datas[p][ry][rx + 2] == 7) {
				return;
			}
			if (datas[p][ry][rx + 1] == 4 && datas[p][ry][rx + 2] == 0) {
				datas[p][ry][rx + 1] = 0;
				datas[p][ry][rx + 2] = 4;
			}
			if (datas[p][ry][rx + 1] == 4 && datas[p][ry][rx + 2] == 3) {
				datas[p][ry][rx + 1] = 0;
				datas[p][ry][rx + 2] = 7;
				Icon im = new ImageIcon("xiangzi-end.png");
				xiangzi[ry][rx + 1].setIcon(im);
				count++;				
			}
			if (datas[p][ry][rx + 1] == 7 && datas[p][ry][rx + 2] == 0) {
				datas[p][ry][rx + 1] = 3;
				datas[p][ry][rx + 2] = 4;
				Icon im = new ImageIcon("xiangzi-op.png");
				xiangzi[ry][rx + 1].setIcon(im);
				count--;
			}
			if (datas[p][ry][rx + 1] == 7 && datas[p][ry][rx + 2] == 3) {
				datas[p][ry][rx + 1] = 3;
				datas[p][ry][rx + 2] = 7;
			}
			xiangzi[ry][rx + 1].setLocation(rx * 50 + 4 + 100, ry * 50 + 30);
			xiangzi[ry][rx + 2] = xiangzi[ry][rx + 1];
			xiangzi[ry][rx + 1] = null;
			lab_ren.setLocation(x + 50, y);
			rx = rx + 1;
			victory();
			return;
		}
	}
	public void keyReleased(KeyEvent e) {
		// TODO 自动生成的方法存根
	}
}
