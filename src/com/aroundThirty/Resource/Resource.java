package com.aroundThirty.Resource;

import com.aroundThirty.boardPage.*;
import com.aroundThirty.mainPageGUI.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Resource {

    public static String[] location = {"서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종", "경기", "강원", "충북", "충남", "전북", "전남", "경북", "경남", "제주"};
    public static JComboBox<String> locationCombo = new JComboBox<>(location);
    public static String[] gender = {"수컷", "암컷"};
    public static JComboBox<String> genderCombo = new JComboBox<>(gender);
    public static String[] dogAndCat = {"강아지", "고양이"};
    public static JComboBox<String> kindCombo = new JComboBox<>(dogAndCat);
    public static Color color = new Color(246, 208, 180, 255);
    public static Color color01 = new Color(255, 250, 200, 255);
    public static Font fontCourier = new Font("Courier New", Font.PLAIN, 25);
    public static Font fontNanum = new Font("나눔고딕", Font.PLAIN, 20);

    public static String catImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/ImgFiles/CatIcon.png";
    public static String loginBGImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/t-r-photography-TzjMd7i5WQI-unsplash.jpeg";
    public static ImageIcon catImgIcon = new ImageIcon(catImgPath);
    public static ImageIcon loginBGImgIcon = new ImageIcon(loginBGImgPath);

    public static final JButton loginMain = new JButton("LOGIN");
    public static final JButton loginPopup = new JButton("LOGIN");
    public static final JButton signUp = new JButton("회원가입");
    public static final JButton switchPet = new JButton(imageSetSize(catImgIcon, 70, 70));
    public static final JButton mainMenuBTN = new JButton("메인메뉴");
    public static final JButton noticeBTN = new JButton("공지사항");
    public static final JButton discoverBTN = new JButton("발견했어요");
    public static final JButton missBTN = new JButton("잃어버렸어요");
    public static final JButton protectBTN = new JButton("보호중이에요");
    public static final JButton newFamBTN = new JButton("새 가족을 찾아요");

    public static DiscoveryPage dp = new DiscoveryPage();
    public static MainMenuPage mmp = new MainMenuPage();
    public static MissPage mp = new MissPage();
    public static NewFamPage nfp = new NewFamPage();
    public static NoticePage np = new NoticePage();
    public static ProtectPage pp = new ProtectPage();
    public static JPanel jPanel;

    static ImageIcon imageSetSize(ImageIcon icon, int i, int j) {
        Image img = icon.getImage();  //ImageIcon을 Image로 변환.
        Image imgScale = img.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imgSize = new ImageIcon(imgScale);
        return imgSize;
    }
}
