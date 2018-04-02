 
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
 * ������ʾ��������
 * @author KaipingZhou
 * 2016/12/16
 */
@SuppressWarnings("serial")
public class MainFrame extends JFrame implements KeyListener{
 
    //�ǣ����
    JLabel lab_wolf;
    //�������ݵ�ģ�⣬ʹ�ö�ά����ģ��
    //1�����ϰ���0����յأ�4��������
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
 
    //�����x����
    int wx ;
    //�����y����
    int wy ;
 
    //��ǰ�ж��ٸ������ƶ�����Ŀ����
    int num = 0;
    //���ӵ�����
    int total = 3;
 
    //��������
    JLabel[][] sheeps = new JLabel[12][16];
 
    public MainFrame(){
        //��ʼ����
        treeInit();
        //��ʼ������
        targetInit();
        //��ʼ������
        sheepInit();
        //��ʼ������
        wolfInit();
        //��ʼ������
        backgroundInit();
        //��ʼ������
        setMainFrameUi();
 
        //��������
        this.addKeyListener(this);
    }
 
    /**
     * ��ʼ���߽磨�ϰ���
     */
    private void treeInit() {
        //����ͼƬ
        Icon ic = new ImageIcon("tree.png");
 
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                if(datas[i][j] == 1){//�ϰ�
                    //��JLable��ʾ�ϰ�
                    JLabel lab_tree = new JLabel(ic);
                    //�����ϰ���Сλ��
                    lab_tree.setBounds(6 + 50 * j, 6 + 50 * i, 50, 50);
                    //��ӵ�������
                    this.add(lab_tree);
                }
            }
        }
    }
 
    /**
     * ��ʼ������
     */
    private void targetInit() {
        //����ͼƬ
        Icon i = new ImageIcon("target.png");
        //��Jable��ʾ����
        JLabel lab_target1 = new JLabel(i);
        //�������ӵ�λ��
        lab_target1.setBounds(706, 206, 50, 50);
        //��ӽ�����
        this.add(lab_target1);
        datas[4][14] = 8;
 
        //����������������
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
     * ��ʼ������
     */
    private void sheepInit() {
 
        //����ͼƬ
        Icon i = new ImageIcon("sheep-no.png");
        //ʹ��JLabel���ģ������
        JLabel lab_sheep1 = new JLabel(i);
        //�������ӵ�λ��
        lab_sheep1.setBounds(306, 206, 50, 50);
        //��������ӵ�������
        this.add(lab_sheep1);
        datas[4][6] = 4;
        //�����Ӵ浽������
        sheeps[4][6] = lab_sheep1;
 
        //����������ֻ��
        JLabel lab_sheep2 = new JLabel(i);
        lab_sheep2.setBounds(306, 306, 50, 50); 
        this.add(lab_sheep2);
        datas[6][6] = 4;
        //�����Ӵ浽������
        sheeps[6][6] = lab_sheep2;
 
        JLabel lab_sheep3 = new JLabel(i);
        lab_sheep3.setBounds(306, 406, 50, 50); 
        this.add(lab_sheep3);
        datas[8][6] = 4;
        //�����Ӵ浽������
        sheeps[8][6] = lab_sheep3;
    }
 
    /**
     * ��ʼ������
     */
    private void wolfInit(){
        //����ĳ�ʼλ��
        wx = 4 ;
        wy = 5 ;
        //����ͼƬ
        Icon i = new ImageIcon("wolf-zm.png");
        //��JLable��ʾ����
        lab_wolf = new JLabel(i);
        //������������Ļ�ϵ���ʾλ��
        lab_wolf.setBounds(6 + wx*50, 6 + wy*50, 50, 50);
        //������ŵ���������
        this.add(lab_wolf);
    }
 
    /**
     * ��ʼ������
     */
    private void backgroundInit(){
        //����ͼƬ
        Icon i = new ImageIcon("bg.png");
        //��JLable��ʾ����
        JLabel lab_bg = new JLabel(i);
        //����JLableλ�����С
        lab_bg.setBounds(6, 6, 800, 600);
        //��JLable��ӵ���������
        this.add(lab_bg);
    }
 
    /**
     * ������������ʾЧ��
     */
    private void setMainFrameUi(){
        //���ò���
        this.setLayout(null);
        //����Ĭ�Ϲر�ѡ��
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //���ñ���
        this.setTitle("������ v1.5.0  auther:ZkP");
        //���ô�С
        this.setSize(824, 650);
        //���þ�����ʾ
        this.setLocationRelativeTo(null);
        //��ʾ����  
        this.setVisible(true);
    }
 
    @Override
    public void keyPressed(KeyEvent e) {
 
    }
 
    @Override
    public void keyReleased(KeyEvent e) {       
        //��ȡ����
        //�� 37
        //�� 38
        //�� 39
        //�� 40
        int key = e.getKeyCode();
 
        if(key == 37){//��
            //�������Ƿ����ϰ�
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
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x - 50, y);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-zb.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy][wx-1] == 8){
                wx = wx - 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x - 50, y);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-zb.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy][wx-1] == 4 && datas[wy][wx-2] == 0){
                //��ȡ���Ӷ��󣬲�����λ��
                sheeps[wy-1][wx].setLocation(6+wx*50-100, 6+wy*50);
                //�����ڵ�ͼ���ƶ�
                sheeps[wy-2][wx] = sheeps[wy-1][wx];
                //����ԭλ�����
                sheeps[wy-1][wx] = null;
                datas[wy][wx-1] = 0;
                datas[wy][wx-2] = 4;
 
                wx = wx - 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x - 50, y);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-zb.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy][wx-1] == 4 && datas[wy][wx-2] == 8){
                //��ȡ���Ӷ��󣬲�����λ��
                sheeps[wy-1][wx].setLocation(6+wx*50-100, 6+wy*50);
                //�����ڵ�ͼ���ƶ�
                sheeps[wy-2][wx] = sheeps[wy-1][wx];
                //����ԭλ�����
                sheeps[wy-1][wx] = null;
                datas[wy][wx-1] = 0;
                datas[wy][wx-2] = 12;
                num++;
 
                wx = wx - 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x - 50, y);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-zb.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy][wx-1] == 12 && datas[wy][wx-2] == 0){
                //��ȡ���Ӷ��󣬲�����λ��
                sheeps[wy-1][wx].setLocation(6+wx*50-100, 6+wy*50);
                //�����ڵ�ͼ���ƶ�
                sheeps[wy-2][wx] = sheeps[wy-1][wx];
                //����ԭλ�����
                sheeps[wy-1][wx] = null;
                datas[wy][wx-1] = 8;
                datas[wy][wx-2] = 4;
                num--;
 
                wx = wx - 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x - 50, y);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-zb.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy][wx-1] == 12 && datas[wy][wx-2] == 8){
                //��ȡ���Ӷ��󣬲�����λ��
                sheeps[wy-1][wx].setLocation(6+wx*50-100, 6+wy*50);
                //�����ڵ�ͼ���ƶ�
                sheeps[wy-2][wx] = sheeps[wy-1][wx];
                //����ԭλ�����
                sheeps[wy-1][wx] = null;
                datas[wy][wx-1] = 8;
                datas[wy][wx-2] = 12;
 
                wx = wx - 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x - 50, y);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-zb.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
        }else if(key == 38){//��
            //����ϱ��Ƿ����ϰ�
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
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x, y - 50);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-sm.png");
                lab_wolf.setIcon(i);
                return;
            }
 
            if(datas[wy-1][wx] == 8){
                wy = wy - 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x, y - 50);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-sm.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy-1][wx] == 4 && datas[wy-2][wx] == 0){
                //��ȡ���Ӷ��󣬲�����λ��
                sheeps[wy-1][wx].setLocation(6+wx*50, 6+wy*50-100);
                //�����ڵ�ͼ���ƶ�
                sheeps[wy-2][wx] = sheeps[wy-1][wx];
                //����ԭλ�����
                sheeps[wy-1][wx] = null;
                datas[wy-1][wx] = 0;
                datas[wy-2][wx] = 4;
 
                wy = wy - 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x, y - 50);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-sm.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy-1][wx] == 4 && datas[wy-2][wx] == 8){
                //��ȡ���Ӷ��󣬲�����λ��
                sheeps[wy-1][wx].setLocation(6+wx*50, 6+wy*50-100);
                //�����ڵ�ͼ���ƶ�
                sheeps[wy-2][wx] = sheeps[wy-1][wx];
                //����ԭλ�����
                sheeps[wy-1][wx] = null;
                datas[wy-1][wx] = 0;
                datas[wy-2][wx] = 12;
                num++;
 
                wy = wy - 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x, y - 50);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-sm.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy-1][wx] == 12 && datas[wy-2][wx] == 0){
                //��ȡ���Ӷ��󣬲�����λ��
                sheeps[wy-1][wx].setLocation(6+wx*50, 6+wy*50-100);
                //�����ڵ�ͼ���ƶ�
                sheeps[wy-2][wx] = sheeps[wy-1][wx];
                //����ԭλ�����
                sheeps[wy-1][wx] = null;
                datas[wy-1][wx] = 8;
                datas[wy-2][wx] = 4;
                num--;
 
                wy = wy - 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x, y - 50);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-sm.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy-1][wx] == 12 && datas[wy-2][wx] == 8){
                //��ȡ���Ӷ��󣬲�����λ��
                sheeps[wy-1][wx].setLocation(6+wx*50, 6+wy*50-100);
                //�����ڵ�ͼ���ƶ�
                sheeps[wy-2][wx] = sheeps[wy-1][wx];
                //����ԭλ�����
                sheeps[wy-1][wx] = null;
                datas[wy-1][wx] = 8;
                datas[wy-2][wx] = 12;
 
                wy = wy - 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x, y - 50);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-sm.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }           
        }else if(key == 39){//��
            //����ұ��Ƿ����ϰ�
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
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x + 50, y);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-ym.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy][wx+1] == 8){
                wx = wx + 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x + 50, y);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-ym.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy][wx+1] == 4 && datas[wy][wx+2] == 0){
                //��ȡ���Ӷ��󣬲�����λ��
                sheeps[wy][wx+1].setLocation(6+wx*50+100, 6+wy*50);
                //�����ڵ�ͼ���ƶ�
                sheeps[wy][wx+2] = sheeps[wy][wx+1];
                //����ԭλ�����
                sheeps[wy][wx+1] = null;
                datas[wy][wx+1] = 0;
                datas[wy][wx+2] = 4;
 
                wx = wx + 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x + 50, y);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-ym.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy][wx+1] == 4 && datas[wy][wx+2] == 8){
                //��ȡ���Ӷ��󣬲�����λ��
                sheeps[wy][wx+1].setLocation(6+wx*50+100, 6+wy*50);
                //�����ڵ�ͼ���ƶ�
                sheeps[wy][wx+2] = sheeps[wy][wx+1];
                //����ԭλ�����
                sheeps[wy][wx+1] = null;
                datas[wy][wx+1] = 0;
                datas[wy][wx+2] = 12;
                num++;
 
                wx = wx + 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x + 50, y);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-ym.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy][wx+1] == 12 && datas[wy][wx+2] == 0){
                //��ȡ���Ӷ��󣬲�����λ��
                sheeps[wy][wx+1].setLocation(6+wx*50+100, 6+wy*50);
                //�����ڵ�ͼ���ƶ�
                sheeps[wy][wx+2] = sheeps[wy][wx+1];
                //����ԭλ�����
                sheeps[wy][wx+1] = null;
                datas[wy][wx+1] = 8;
                datas[wy][wx+2] = 4;
                num--;
 
                wx = wx + 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x + 50, y);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-ym.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy][wx+1] == 12 && datas[wy][wx+2] == 8){
                //��ȡ���Ӷ��󣬲�����λ��
                sheeps[wy][wx+1].setLocation(6+wx*50+100, 6+wy*50);
                //�����ڵ�ͼ���ƶ�
                sheeps[wy][wx+2] = sheeps[wy][wx+1];
                //����ԭλ�����
                sheeps[wy][wx+1] = null;
                datas[wy][wx+1] = 8;
                datas[wy][wx+2] = 12;
 
                wx = wx + 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x + 50, y);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-ym.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }           
        }else if(key == 40){//��
            //����±��Ƿ����ϰ�
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
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x, y + 50);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-zm.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy+1][wx] == 8){
                wy = wy + 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x, y + 50);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-zm.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy+1][wx] == 4 && datas[wy+2][wx] == 0){
                //��ȡ���Ӷ��󣬲�����λ��
                sheeps[wy+1][wx].setLocation(6+wx*50, 6+wy*50+100);
                //�����ڵ�ͼ���ƶ�
                sheeps[wy+2][wx] = sheeps[wy+1][wx];
                //����ԭλ�����
                sheeps[wy+1][wx] = null;
                datas[wy+1][wx] = 0;
                datas[wy+2][wx] = 4;
 
                wy = wy + 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x, y + 50);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-zm.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy+1][wx] == 4 && datas[wy+2][wx] == 8){
                //��ȡ���Ӷ��󣬲�����λ��
                sheeps[wy+1][wx].setLocation(6+wx*50, 6+wy*50+100);
                //�����ڵ�ͼ���ƶ�
                sheeps[wy+2][wx] = sheeps[wy+1][wx];
                //����ԭλ�����
                sheeps[wy+1][wx] = null;
                datas[wy+1][wx] = 0;
                datas[wy+2][wx] = 12;
                num++;
 
                wy = wy + 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x, y + 50);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-zm.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy+1][wx] == 12 && datas[wy+2][wx] == 0){
                //��ȡ���Ӷ��󣬲�����λ��
                sheeps[wy+1][wx].setLocation(6+wx*50, 6+wy*50+100);
                //�����ڵ�ͼ���ƶ�
                sheeps[wy+2][wx] = sheeps[wy+1][wx];
                //����ԭλ�����
                sheeps[wy+1][wx] = null;
                datas[wy+1][wx] = 8;
                datas[wy+2][wx] = 4;
                num--;
 
                wy = wy + 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x, y + 50);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-zm.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }
 
            if(datas[wy+1][wx] == 12 && datas[wy+2][wx] == 8){
                //��ȡ���Ӷ��󣬲�����λ��
                sheeps[wy+1][wx].setLocation(6+wx*50, 6+wy*50+100);
                //�����ڵ�ͼ���ƶ�
                sheeps[wy+2][wx] = sheeps[wy+1][wx];
                //����ԭλ�����
                sheeps[wy+1][wx] = null;
                datas[wy+1][wx] = 8;
                datas[wy+2][wx] = 12;
 
                wy = wy + 1;
                //��ȡ�����x��y����
                int x = (int) lab_wolf.getLocation().getX();
                int y = (int) lab_wolf.getLocation().getY();
                //�����ƶ�
                lab_wolf.setLocation(x, y + 50);
                //�����ƶ������ͼƬ
                Icon i = new ImageIcon("wolf-zm.png");
                lab_wolf.setIcon(i);
                //�ж�ʤ��
                win();
                return;
            }           
        }
    }
 
    @Override
    public void keyTyped(KeyEvent e) {
 
    }
 
    /**
     * �ж�ʤ��
     */
    private void win() {
        if(num == total){
            //System.out.println("ʤ��");
            //�Ƴ���������¼��������û��������
            this.removeKeyListener(this);
             
            //��ʾ�Ի���
            JDialog dialog = new JDialog(this, "��ϲ����");
            dialog.setSize(400,300);
            //����Ļ������ʾ
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


