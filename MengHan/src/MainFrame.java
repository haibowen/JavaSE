 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
 
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
/**
 * 用做显示的主窗体
 * @author KaipingZhou
 * 2016/12/16
 */
@SuppressWarnings("serial")
public class MainFrame extends JFrame implements KeyListener{
 
    //狼（人物）
    JLabel lab_wolf;
    //场景数据的模拟，使用二维数组模拟
    //1代表障碍，0代表空地，4代表箱子
    int[][] datas = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,1,0,0,0,0,0,0,1,1,1,0,0,0,1},
            {1,0,1,0,0,0,1,0,0,1,0,0,0,0,0,1},
            {1,0,1,0,0,0,0,0,0,1,1,1,0,0,0,1},
            {1,0,1,0,0,0,0,0,0,0,0,1,0,0,0,1},
            {1,0,1,0,0,0,0,0,0,1,1,1,0,0,0,1},
            {1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
 
    //人物的x坐标
    int wx ;
    //人物的y坐标
    int wy ;
 
    //当前有多少个箱子移动到了目标中
    int num = 0;
    //箱子的总数
    int total = 3;
 
    //箱子数组
    JLabel[][] sheeps = new JLabel[12][16];
 
    public MainFrame(){
        //初始化树
        treeInit();
        //初始化笼子
        targetInit();
        //初始化箱子
        sheepInit();
        //初始化人物
        wolfInit();
        //初始化背景
        backgroundInit();
        //初始化窗体
        setMainFrameUi();
 
        //监听键盘
        this.addKeyListener(this);
    }
 
    /**
     * 初始化边界（障碍）
     */
    private void treeInit() {
        //加载图片
        Icon ic = new ImageIcon("tree.png");
 
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                if(datas[i][j] == 1){//障碍
                    //用JLable显示障碍
                    JLabel lab_tree = new JLabel(ic);
                    //设置障碍大小位置
                    lab_tree.setBounds(6 + 50 * j, 6 + 50 * i, 50, 50);
                    //添加到窗体中
                    this.add(lab_tree);
                }
            }
        }
    }
 
    /**
     * 初始化笼子
     */
    private void targetInit() {
        //加载图片
        Icon i = new ImageIcon("target.png");
        //用Jable显示笼子
        JLabel lab_target1 = new JLabel(i);
        //设置笼子的位置
        lab_target1.setBounds(706, 206, 50, 50);
        //添加进窗体
        this.add(lab_target1);
        datas[4][14] = 8;
 
        //制作其他两个笼子
        JLabel lab_target2 = new JLabel(i);
        lab_target2.setBounds(706, 256, 50, 50);
        this.add(lab_target2);
        datas[5][14] = 8;
 
        JLabel lab_target3 = new JLabel(i);
        lab_target3.setBounds(706, 306, 50, 50);
        this.add(lab_target3);
        datas[6][14] = 8;
    }
 
    /**
     * 初始化箱子
     */
    private void sheepInit() {
 
        //载入图片
        Icon i = new ImageIcon("sheep-no.png");
        //使用JLabel组件模拟箱子
        JLabel lab_sheep1 = new JLabel(i);
        //设置箱子的位置
        lab_sheep1.setBounds(306, 206, 50, 50);
        //把箱子添加到窗体中
        this.add(lab_sheep1);
        datas[4][6] = 4;
        //把箱子存到数组中
        sheeps[4][6] = lab_sheep1;
 
        //制作其他两只羊
        JLabel lab_sheep2 = new JLabel(i);
        lab_sheep2.setBounds(306, 306, 50, 50); 
        this.add(lab_sheep2);
        datas[6][6] = 4;
        //把箱子存到数组中
        sheeps[6][6] = lab_sheep2;
 
        JLabel lab_sheep3 = new JLabel(i);
        lab_sheep3.setBounds(306, 406, 50, 50); 
        this.add(lab_sheep3);
        datas[8][6] = 4;
        //把箱子存到数组中
        sheeps[8][6] = lab_sheep3;
    }
 
    /**
     * 初始化人物
     */
    private void wolfInit(){
        //人物的初始位置
        wx = 4 ;
        wy = 5 ;
        //加载图片
        Icon i = new ImageIcon("wolf-zm.png");
        //用JLable显示人物
        lab_wolf = new JLabel(i);
        //设置人物在屏幕上的显示位置
        lab_wolf.setBounds(6 + wx*50, 6 + wy*50, 50, 50);
        //把人物放到窗体里面
        this.add(lab_wolf);
    }
 
    /**
     * 初始化背景
     */
    private void backgroundInit(){
        //加载图片
        Icon i = new ImageIcon("bg.png");
        //用JLable显示背景
        JLabel lab_bg = new JLabel(i);
        //设置JLable位置与大小
        lab_bg.setBounds(6, 6, 800, 600);
        //将JLable添加到窗体里面
        this.add(lab_bg);
    }
 
    /**
     * 设置主窗体显示效果
     */
    private void setMainFrameUi(){
        //设置布局
        this.setLayout(null);
        //设置默认关闭选项
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置标题
        this.setTitle("推箱子 v1.5.0  auther:ZkP");
        //设置大小
        this.setSize(824, 650);
        //设置居中显示
        this.setLocationRelativeTo(null);
        //显示窗体  
        this.setVisible(true);
    }
 
    @Override
    public void keyPressed(KeyEvent e) {
 
    }
 
    @Override
    public void keyReleased(KeyEvent e) {       
        //获取按键
        //左 37
        //上 38
        //右 39
        //下 40
        int key = e.getKeyCode();
 
        if(key == 37){//左
            //检测左边是否有障碍
            if(datas[wy][wx-1] == 1){
                return;
            }
 
            if(datas[wy][wx-1] == 4 && datas[wy][wx-2] == 1){
                return;
            }
 
            if(datas[wy][wx-1] == 4 && datas[wy][wx-2] == 4){
                return;
            }
 
            if(datas[wy][wx-1] == 4 && datas[wy][wx-2] == 12){
                return;
            }
 
            if(datas[wy][wx-1] == 12 && datas[wy][wx-2] == 1){
                return;
            }
 
            if(datas[wy][wx-1] == 12 && datas[wy][wx-2] == 4){
                return;
            }
 
            if(datas[wy][wx-1] == 12 && datas[wy][wx-2] == 12){
                return;
            }
 
            if(datas[wy][wx-1] == 0){
                wx = wx - 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x - 50, y);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-zb.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy][wx-1] == 8){
                wx = wx - 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x - 50, y);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-zb.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy][wx-1] == 4 && datas[wy][wx-2] == 0){
                //获取箱子对象，并设置位置
                sheeps[wy-1][wx].setLocation(6+wx*50-100, 6+wy*50);
                //箱子在地图上移动
                sheeps[wy-2][wx] = sheeps[wy-1][wx];
                //箱子原位置清空
                sheeps[wy-1][wx] = null;
                datas[wy][wx-1] = 0;
                datas[wy][wx-2] = 4;
 
                wx = wx - 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x - 50, y);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-zb.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy][wx-1] == 4 && datas[wy][wx-2] == 8){
                //获取箱子对象，并设置位置
                sheeps[wy-1][wx].setLocation(6+wx*50-100, 6+wy*50);
                //箱子在地图上移动
                sheeps[wy-2][wx] = sheeps[wy-1][wx];
                //箱子原位置清空
                sheeps[wy-1][wx] = null;
                datas[wy][wx-1] = 0;
                datas[wy][wx-2] = 12;
                num++;
 
                wx = wx - 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x - 50, y);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-zb.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy][wx-1] == 12 && datas[wy][wx-2] == 0){
                //获取箱子对象，并设置位置
                sheeps[wy-1][wx].setLocation(6+wx*50-100, 6+wy*50);
                //箱子在地图上移动
                sheeps[wy-2][wx] = sheeps[wy-1][wx];
                //箱子原位置清空
                sheeps[wy-1][wx] = null;
                datas[wy][wx-1] = 8;
                datas[wy][wx-2] = 4;
                num--;
 
                wx = wx - 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x - 50, y);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-zb.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy][wx-1] == 12 && datas[wy][wx-2] == 8){
                //获取箱子对象，并设置位置
                sheeps[wy-1][wx].setLocation(6+wx*50-100, 6+wy*50);
                //箱子在地图上移动
                sheeps[wy-2][wx] = sheeps[wy-1][wx];
                //箱子原位置清空
                sheeps[wy-1][wx] = null;
                datas[wy][wx-1] = 8;
                datas[wy][wx-2] = 12;
 
                wx = wx - 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x - 50, y);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-zb.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
        }else if(key == 38){//上
            //检测上边是否有障碍
            if(datas[wy-1][wx] == 1){
                return;
            }
 
            if(datas[wy-1][wx] == 4 && datas[wy-2][wx] == 1){
                return;
            }
 
            if(datas[wy-1][wx] == 4 && datas[wy-2][wx] == 4){
                return;
            }
 
            if(datas[wy-1][wx] == 4 && datas[wy-2][wx] == 12){
                return;
            }
 
            if(datas[wy-1][wx] == 12 && datas[wy-2][wx] == 1){
                return;
            }
 
            if(datas[wy-1][wx] == 12 && datas[wy-2][wx] == 4){
                return;
            }
 
            if(datas[wy-1][wx] == 12 && datas[wy-2][wx] == 12){
                return;
            }
 
            if(datas[wy-1][wx] == 0){
                wy = wy - 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x, y - 50);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-sm.png");
                lab_wolf.setIcon(i);
                return;
            }
 
            if(datas[wy-1][wx] == 8){
                wy = wy - 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x, y - 50);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-sm.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy-1][wx] == 4 && datas[wy-2][wx] == 0){
                //获取箱子对象，并设置位置
                sheeps[wy-1][wx].setLocation(6+wx*50, 6+wy*50-100);
                //箱子在地图上移动
                sheeps[wy-2][wx] = sheeps[wy-1][wx];
                //箱子原位置清空
                sheeps[wy-1][wx] = null;
                datas[wy-1][wx] = 0;
                datas[wy-2][wx] = 4;
 
                wy = wy - 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x, y - 50);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-sm.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy-1][wx] == 4 && datas[wy-2][wx] == 8){
                //获取箱子对象，并设置位置
                sheeps[wy-1][wx].setLocation(6+wx*50, 6+wy*50-100);
                //箱子在地图上移动
                sheeps[wy-2][wx] = sheeps[wy-1][wx];
                //箱子原位置清空
                sheeps[wy-1][wx] = null;
                datas[wy-1][wx] = 0;
                datas[wy-2][wx] = 12;
                num++;
 
                wy = wy - 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x, y - 50);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-sm.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy-1][wx] == 12 && datas[wy-2][wx] == 0){
                //获取箱子对象，并设置位置
                sheeps[wy-1][wx].setLocation(6+wx*50, 6+wy*50-100);
                //箱子在地图上移动
                sheeps[wy-2][wx] = sheeps[wy-1][wx];
                //箱子原位置清空
                sheeps[wy-1][wx] = null;
                datas[wy-1][wx] = 8;
                datas[wy-2][wx] = 4;
                num--;
 
                wy = wy - 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x, y - 50);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-sm.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy-1][wx] == 12 && datas[wy-2][wx] == 8){
                //获取箱子对象，并设置位置
                sheeps[wy-1][wx].setLocation(6+wx*50, 6+wy*50-100);
                //箱子在地图上移动
                sheeps[wy-2][wx] = sheeps[wy-1][wx];
                //箱子原位置清空
                sheeps[wy-1][wx] = null;
                datas[wy-1][wx] = 8;
                datas[wy-2][wx] = 12;
 
                wy = wy - 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x, y - 50);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-sm.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }           
        }else if(key == 39){//右
            //检测右边是否有障碍
            if(datas[wy][wx+1] == 1){
                return;
            }
 
            if(datas[wy][wx+1] == 4 && datas[wy][wx+2] == 1){
                return;
            }
 
            if(datas[wy][wx+1] == 4 && datas[wy][wx+2] == 4){
                return;
            }
 
            if(datas[wy][wx+1] == 4 && datas[wy][wx+2] == 12){
                return;
            }
 
            if(datas[wy][wx+1] == 12 && datas[wy][wx+2] == 1){
                return;
            }
 
            if(datas[wy][wx+1] == 12 && datas[wy][wx+2] == 4){
                return;
            }
 
            if(datas[wy][wx+1] == 12 && datas[wy][wx+2] == 12){
                return;
            }
 
            if(datas[wy][wx+1] == 0){
                wx = wx + 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x + 50, y);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-ym.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy][wx+1] == 8){
                wx = wx + 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x + 50, y);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-ym.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy][wx+1] == 4 && datas[wy][wx+2] == 0){
                //获取箱子对象，并设置位置
                sheeps[wy][wx+1].setLocation(6+wx*50+100, 6+wy*50);
                //箱子在地图上移动
                sheeps[wy][wx+2] = sheeps[wy][wx+1];
                //箱子原位置清空
                sheeps[wy][wx+1] = null;
                datas[wy][wx+1] = 0;
                datas[wy][wx+2] = 4;
 
                wx = wx + 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x + 50, y);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-ym.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy][wx+1] == 4 && datas[wy][wx+2] == 8){
                //获取箱子对象，并设置位置
                sheeps[wy][wx+1].setLocation(6+wx*50+100, 6+wy*50);
                //箱子在地图上移动
                sheeps[wy][wx+2] = sheeps[wy][wx+1];
                //箱子原位置清空
                sheeps[wy][wx+1] = null;
                datas[wy][wx+1] = 0;
                datas[wy][wx+2] = 12;
                num++;
 
                wx = wx + 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x + 50, y);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-ym.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy][wx+1] == 12 && datas[wy][wx+2] == 0){
                //获取箱子对象，并设置位置
                sheeps[wy][wx+1].setLocation(6+wx*50+100, 6+wy*50);
                //箱子在地图上移动
                sheeps[wy][wx+2] = sheeps[wy][wx+1];
                //箱子原位置清空
                sheeps[wy][wx+1] = null;
                datas[wy][wx+1] = 8;
                datas[wy][wx+2] = 4;
                num--;
 
                wx = wx + 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x + 50, y);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-ym.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy][wx+1] == 12 && datas[wy][wx+2] == 8){
                //获取箱子对象，并设置位置
                sheeps[wy][wx+1].setLocation(6+wx*50+100, 6+wy*50);
                //箱子在地图上移动
                sheeps[wy][wx+2] = sheeps[wy][wx+1];
                //箱子原位置清空
                sheeps[wy][wx+1] = null;
                datas[wy][wx+1] = 8;
                datas[wy][wx+2] = 12;
 
                wx = wx + 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x + 50, y);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-ym.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }           
        }else if(key == 40){//下
            //检测下边是否有障碍
            if(datas[wy+1][wx] == 1){
                return;
            }
 
            if(datas[wy+1][wx] == 4 && datas[wy+2][wx] == 1){
                return;
            }
 
            if(datas[wy+1][wx] == 4 && datas[wy+2][wx] == 4){
                return;
            }
 
            if(datas[wy+1][wx] == 4 && datas[wy+2][wx] == 12){
                return;
            }
 
            if(datas[wy+1][wx] == 12 && datas[wy+2][wx] == 1){
                return;
            }
 
            if(datas[wy+1][wx] == 12 && datas[wy+2][wx] == 4){
                return;
            }
 
            if(datas[wy+1][wx] == 12 && datas[wy+2][wx] == 12){
                return;
            }
 
            if(datas[wy+1][wx] == 0){
                wy = wy + 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x, y + 50);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-zm.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy+1][wx] == 8){
                wy = wy + 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x, y + 50);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-zm.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy+1][wx] == 4 && datas[wy+2][wx] == 0){
                //获取箱子对象，并设置位置
                sheeps[wy+1][wx].setLocation(6+wx*50, 6+wy*50+100);
                //箱子在地图上移动
                sheeps[wy+2][wx] = sheeps[wy+1][wx];
                //箱子原位置清空
                sheeps[wy+1][wx] = null;
                datas[wy+1][wx] = 0;
                datas[wy+2][wx] = 4;
 
                wy = wy + 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x, y + 50);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-zm.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy+1][wx] == 4 && datas[wy+2][wx] == 8){
                //获取箱子对象，并设置位置
                sheeps[wy+1][wx].setLocation(6+wx*50, 6+wy*50+100);
                //箱子在地图上移动
                sheeps[wy+2][wx] = sheeps[wy+1][wx];
                //箱子原位置清空
                sheeps[wy+1][wx] = null;
                datas[wy+1][wx] = 0;
                datas[wy+2][wx] = 12;
                num++;
 
                wy = wy + 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x, y + 50);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-zm.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy+1][wx] == 12 && datas[wy+2][wx] == 0){
                //获取箱子对象，并设置位置
                sheeps[wy+1][wx].setLocation(6+wx*50, 6+wy*50+100);
                //箱子在地图上移动
                sheeps[wy+2][wx] = sheeps[wy+1][wx];
                //箱子原位置清空
                sheeps[wy+1][wx] = null;
                datas[wy+1][wx] = 8;
                datas[wy+2][wx] = 4;
                num--;
 
                wy = wy + 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x, y + 50);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-zm.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }
 
            if(datas[wy+1][wx] == 12 && datas[wy+2][wx] == 8){
                //获取箱子对象，并设置位置
                sheeps[wy+1][wx].setLocation(6+wx*50, 6+wy*50+100);
                //箱子在地图上移动
                sheeps[wy+2][wx] = sheeps[wy+1][wx];
                //箱子原位置清空
                sheeps[wy+1][wx] = null;
                datas[wy+1][wx] = 8;
                datas[wy+2][wx] = 12;
 
                wy = wy + 1;
                //获取人物的x，y坐标
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //往右移动
                lab_wolf.setLocation(x, y + 50);
                //人物移动后更新图片
                Icon i = new ImageIcon("wolf-zm.png");
                lab_wolf.setIcon(i);
                //判断胜利
                win();
                return;
            }           
        }
    }
 
    @Override
    public void keyTyped(KeyEvent e) {
 
    }
 
    /**
     * 判断胜利
     */
    private void win() {
        if(num == total){
            //System.out.println("胜利");
            //移除窗体键盘事件，避免用户多余操作
            this.removeKeyListener(this);
             
            //显示对话框
            JDialog dialog = new JDialog(this, "恭喜过关");
            dialog.setSize(400,300);
            //在屏幕中央显示
            dialog.setLocationRelativeTo(null);
            dialog.setLayout(null);
             
            JLabel info = new JLabel(new ImageIcon("gg.jpg"));
            info.setBounds(2, 2, 380, 180);
            dialog.add(info);
             
            JLabel link = new JLabel(new ImageIcon("gg.png"));
            link.setBounds(2, 182, 380, 88);            
            link.addMouseListener(new MouseListener() {
                 
                @Override
                public void mouseReleased(MouseEvent e) {
                     
                }
                 
                @Override
                public void mousePressed(MouseEvent e) {
                    try {
                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler https://blog.csdn.net/qq_32353771?viewmode=list");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                 
                @Override
                public void mouseExited(MouseEvent e) {
                     
                }
                 
                @Override
                public void mouseEntered(MouseEvent e) {
                     
                }
                 
                @Override
                public void mouseClicked(MouseEvent e) {
                     
                }
            });
             
            dialog.add(link);
             
            dialog.setVisible(true);
        }
    }
}


