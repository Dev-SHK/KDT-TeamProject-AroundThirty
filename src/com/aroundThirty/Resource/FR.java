package com.aroundThirty.Resource;

import com.aroundThirty.View.*;

import javax.swing.*;
import java.awt.*;

public class FR {

    public static String title = "귀엽개 앙큼하냥";

    public static String[] location = {"서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종", "경기", "강원", "충북", "충남", "전북", "전남", "경북", "경남", "제주"};
    public static JComboBox<String> locationCombo = new JComboBox<>(location);

    public static String[] locationSeoul = {"종로구", "중구", "용산구", "성동구", "광진구", "동대문구", "중랑구", "성북구", "강북구", "도봉구", "노원구", "은평구", "서대문구", "마포구", "양천구", "강서구", "구로구", "금천구", "영등포구", "동작구", "관악구", "서초구", "강남구", "송파구", "강동구"};
    public static JComboBox<String> seoulCombo = new JComboBox<>(locationSeoul);

    public static String[] locationBusan = {"중구", "서구", "동구", "영동구", "부산진구", "동래구", "남구", "북구", "해운대구", "금정구", "사하구", "강서구", "연제구", "수영구", "사상구", "기장구"};
    public static JComboBox<String> busanCombo = new JComboBox<>(locationBusan);

    public static String[] locationDaegu = {"중구", "동구", "서구", "남구", "북구", "수성구", "달서구", "달성군"};
    public static JComboBox<String> daeguCombo = new JComboBox<>(locationDaegu);

    public static String[] locationIncheon = {"중구", "동구", "미추홀구", "연수구", "남동구", "부평구", "계양구", "서구", "강화군", "옹진군"};
    public static JComboBox<String> incheonCombo = new JComboBox<>(locationIncheon);

    public static String[] locationGwangju = {"동구", "서구", "남구", "북구", "광산구"};
    public static JComboBox<String> gwangjuCombo = new JComboBox<>(locationGwangju);

    public static String[] locationDaejeon = {"동구", "중구", "서구", "유성구", "대덕구"};
    public static JComboBox<String> daejeonCombo = new JComboBox<>(locationDaejeon);

    public static String[] locationUlsan = {"중구", "남구", "동구", "북구", "울주군"};
    public static JComboBox<String> ulsanCombo = new JComboBox<>(locationUlsan);

    public static String[] locationSejong = {"반곡동", "소담동", "보람동", "대평동", "가람동", "한솔동", "나성동", "새롬동", "다정동", "어진동", "종촌동", "고운동", "아름동", "도담동", "산울동", "해밀동", "합강동", "집현동", "조치원읍", "연기면", "연동면", "부강면", "금남면", "장군면", "연서면", "전의면", "전동면", "소정면"};
    public static JComboBox<String> sejongCombo = new JComboBox<>(locationSejong);

    public static String[] locationGyeonggi = {"수원시", "성남시", "의정부시", "안양시", "부천시", "광명시", "평택시", "동두천시", "안산시", "고양시", "과천시", "구리시", "남양주시", "오산시", "시흥시", "군포시", "의왕시", "하남시", "용인시", "파주시", "이천시", "안성시", "김포시", "화성시", "광주시", "양주시", "포천시", "여주시", "연천군", "가평군", "양평군"};
    public static JComboBox<String> gyeonggiCombo = new JComboBox<>(locationGyeonggi);

    public static String[] locationGangwon = {"춘천시", "원주시", "강릉시", "동해시", "태백시", "속초시", "삼척시", "홍천군", "횡성군", "영월군", "평창군", "정선군", "철원군", "화천군", "양구군", "인제군", "고성군", "양양군"};
    public static JComboBox<String> gangwonCombo = new JComboBox<>(locationGangwon);

    public static String[] locationChungBuk = {"청주시", "충주시", "제천시", "보은군", "옥천군", "영동군", "증평군", "진천군", "괴산군", "음성군", "단양군"};
    public static JComboBox<String> chungBukCombo = new JComboBox<>(locationChungBuk);

    public static String[] locationChungNam = {"천안시", "공주시", "보령시", "아산시", "서산시", "논산시", "계룡시", "당진시", "금산군", "부여군", "서천군", "청양군", "홍성군", "예산군", "태안군"};
    public static JComboBox<String> chungNamCombo = new JComboBox<>(locationChungNam);

    public static String[] locationJeonBuk = {"전주시", "군산시", "익산시", "정읍시", "남원시", "김제시", "완주군", "진안군", "무주군", "장수군", "임실군", "순창군", "고창군", "부안군"};
    public static JComboBox<String> jeonBukCombo = new JComboBox<>(locationJeonBuk);

    public static String[] locationJeonNam = {"목포시", "여수시", "순천시", "나주시", "광양시", "담양군", "곡성군", "구례군", "고흥군", "보성군", "화순군", "장흥군", "강진군", "해남군", "영암군", "무안군", "함평군", "영광군", "장성군", "완도군", "진도군", "신안군"};
    public static JComboBox<String> jeonNamCombo = new JComboBox<>(locationJeonNam);

    public static String[] locationGyeongBuk = {"포항시", "경주시", "김천시", "안동시", "구미시", "영주시", "영천시", "상주시", "문경시", "경산시", "군위군", "의성군", "청송군", "영양군", "영덕군", "청도군", "고령군", "성주군", "칠곡군", "예천군", "봉화군", "울진군", "울릉군"};
    public static JComboBox<String> gyeongBukCombo = new JComboBox<>(locationGyeongBuk);

    public static String[] locationGyeongNam = {"창원시", "진주시", "통영시", "사천시", "김해시", "밀양시", "거제시", "양산시", "의령군", "함안군", "창녕군", "고성군", "남해군", "하동군", "산청군", "함양군", "거창군", "합천군"};
    public static JComboBox<String> gyeongNamCombo = new JComboBox<>(locationGyeongNam);

    public static String[] locationJeju = {"제주시", "서귀포시"};
    public static JComboBox<String> jejuCombo = new JComboBox<>(locationJeju);

    public static String[] gender = {"수컷", "암컷"};
    public static JComboBox<String> genderCombo = new JComboBox<>(gender);

    public static String[] dogAndCat = {"강아지", "고양이"};
    public static JComboBox<String> kindCombo = new JComboBox<>(dogAndCat);

    public static Color pastelPink = new Color(253, 224, 206, 255);
    public static Color pastelYellow = new Color(255, 250, 200, 255);
    public static Color pastelGreen = new Color(229, 250, 164, 255);
    public static Font fontCourier = new Font("Courier New", Font.PLAIN, 25);
    public static Font fontNanum = new Font("나눔고딕", Font.PLAIN, 13);
    public static Font fontAppGothic = new Font("AppleGothic", Font.PLAIN, 12);

    public static String catImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/ImgFiles/CatIcon.png";
    public static String dogImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/Dog.png";
    public static String searchImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/free-icon-rounded-magnifying-glass-13267.png";
    public static String bgImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/bg-dog.png";
    public static String rpDetailImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/KakaoTalk_Photo_2022-02-07-17-06-30.jpeg";

    public static ImageIcon catImgIcon = new ImageIcon(catImgPath);
    public static ImageIcon dogImgIcon = new ImageIcon(dogImgPath);
    public static ImageIcon searchImgIcon = new ImageIcon(searchImgPath);
    public static ImageIcon bgImg = new ImageIcon(bgImgPath);
    public static ImageIcon rpDetailImg = new ImageIcon(rpDetailImgPath);

    public static JButton loginMain = new JButton("LOGIN");
    public static final JButton logoutMain = new JButton("LOGOUT");
    public static final JButton loginPopup = new JButton("LOGIN");
    public static final JButton signUp = new JButton("회원가입");
    public static final JButton catBTN = new JButton(imageSetSize(catImgIcon, 50, 50));
    public static final JButton dogBTN = new JButton(imageSetSize(dogImgIcon, 50, 50));
    public static final JButton searchBTN = new JButton(imageSetSize(searchImgIcon, 25, 25));
    public static final JButton addFile = new JButton("파일첨부");
    public static final JTextField idTxtFld = new JTextField(20);
    public static final JPasswordField pwTxtFld = new JPasswordField(20);
    public static final JButton modifyBtn = new JButton("수정");
    public static final JButton deleteBtn = new JButton("삭제");
    public static final JButton postBtn = new JButton("완료");
    public static final JButton test = new JButton("test"); // 임시 버튼
    public static JButton rbtn = new JButton();
    public static Boolean click = true;
    public static CardLayout cardLayout = new CardLayout();

    public static ReportPage rep = new ReportPage();
    public static MissingPage mp = new MissingPage();
    public static AdoptPage ap = new AdoptPage();
    public static TemporaryPage tep = new TemporaryPage();
    public static AddFileWindow afw;
    public static LoginPage loginPage;
    public static SignUpPage signUpPage;

    public static CenterPanel cp;
    public static LeftPanel lp;
    public static RightPanel rp;
    public static BottomPanel bp;
    public static RightTopPanel rtp;
    public static SearchData sd;

    public static String dog01ImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/dog/dog01.jpeg";
    public static ImageIcon dog01ImgIcon = new ImageIcon(dog01ImgPath);
    public static String dog02ImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/dog/dog02.jpeg";
    public static ImageIcon dog02ImgIcon = new ImageIcon(dog02ImgPath);
    public static String dog03ImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/dog/dog03.jpeg";
    public static ImageIcon dog03ImgIcon = new ImageIcon(dog03ImgPath);
    public static String dog04ImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/dog/dog04.jpeg";
    public static ImageIcon dog04ImgIcon = new ImageIcon(dog04ImgPath);
    public static String dog05ImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/dog/dog05.jpeg";
    public static ImageIcon dog05ImgIcon = new ImageIcon(dog05ImgPath);
    public static String dog06ImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/dog/dog06.jpeg";
    public static ImageIcon dog06ImgIcon = new ImageIcon(dog06ImgPath);
    public static String dog07ImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/dog/dog07.jpeg";
    public static ImageIcon dog07ImgIcon = new ImageIcon(dog07ImgPath);
    public static String dog08ImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/dog/dog08.jpeg";
    public static ImageIcon dog08ImgIcon = new ImageIcon(dog08ImgPath);
    public static String dog09ImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/dog/dog09.jpeg";
    public static ImageIcon dog09ImgIcon = new ImageIcon(dog09ImgPath);
    public static String dog10ImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/dog/dog10.jpeg";
    public static ImageIcon dog10ImgIcon = new ImageIcon(dog10ImgPath);
    public static String dog11ImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/dog/dog11.jpeg";
    public static ImageIcon dog11ImgIcon = new ImageIcon(dog11ImgPath);
    public static String dog12ImgPath = "/Volumes/SHK-USB-64G/KDT-SW개발자과정/Project/src/com/aroundThirty/imgFiles/dog/dog12.jpeg";
    public static ImageIcon dog12ImgIcon = new ImageIcon(dog12ImgPath);

    public static ImageIcon[] imgArr = {dog01ImgIcon, dog02ImgIcon, dog03ImgIcon, dog04ImgIcon, dog05ImgIcon, dog06ImgIcon, dog07ImgIcon, dog08ImgIcon, dog09ImgIcon, dog10ImgIcon, dog11ImgIcon, dog12ImgIcon};


    public static ImageIcon imageSetSize(ImageIcon icon, int i, int j) {
        Image img = icon.getImage();  //ImageIcon을 Image로 변환.
        Image imgScale = img.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imgSize = new ImageIcon(imgScale);
        return imgSize;
    }
}
