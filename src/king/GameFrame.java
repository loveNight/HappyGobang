package king;

/**
 * ��Ϸ����
 */
import java.awt.Toolkit;
import javax.swing.JFrame;
public class GameFrame extends JFrame{
    public GameFrame(){
        super("����������");//���ڱ���
        //��������
        ChessBoard chessBoard = new ChessBoard();
        add(chessBoard);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();         
        //����������Ϊ������ʾ
        //Toolkit�ǳ����ֻ࣬����getDefaultToolkit()��������ȡʵ����
        //getScreenSize()�������ص���һ��Dimension���󣬻�����getWidth()��ȡ����
        int screenSizeX = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int screenSizeY = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int fSizeX = (int)getSize().getWidth();
        int fSizeY = (int)getSize().getHeight();
        setResizable(false);//��ֹ�ı䴰�ڴ�С
        setBounds((screenSizeX-fSizeX)/2, (screenSizeY-fSizeY)/2, fSizeX,fSizeY );
        setVisible(true);
    }    
}