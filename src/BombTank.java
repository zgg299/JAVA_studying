//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

public class BombTank {
	private int x;
	private int y;
	private boolean live = true;
	private TankClient tc;
	private static Toolkit tk = Toolkit.getDefaultToolkit();
	private static Image[] imgs;
	int step = 0;

	public BombTank(int x, int y, TankClient tc) {
		this.x = x;
		this.y = y;
		this.tc = tc;
	}

	public void draw(Graphics g) {
		if (!this.live) {
			this.tc.bombTanks.remove(this);
		} else if (this.step == imgs.length) {
			this.live = false;
			this.step = 0;
		} else {
			g.drawImage(imgs[this.step], this.x, this.y, (ImageObserver)null);
			++this.step;
		}
	}

	static {
		imgs = new Image[]{tk.getImage(BombTank.class.getClassLoader().getResource("images/1.gif")), tk.getImage(BombTank.class.getClassLoader().getResource("images/2.gif")), tk.getImage(BombTank.class.getClassLoader().getResource("images/3.gif")), tk.getImage(BombTank.class.getClassLoader().getResource("images/4.gif")), tk.getImage(BombTank.class.getClassLoader().getResource("images/5.gif")), tk.getImage(BombTank.class.getClassLoader().getResource("images/6.gif")), tk.getImage(BombTank.class.getClassLoader().getResource("images/7.gif")), tk.getImage(BombTank.class.getClassLoader().getResource("images/8.gif")), tk.getImage(BombTank.class.getClassLoader().getResource("images/9.gif")), tk.getImage(BombTank.class.getClassLoader().getResource("images/10.gif"))};
	}
}
