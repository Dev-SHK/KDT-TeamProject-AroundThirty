package com.aroundThirty.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static com.aroundThirty.Resource.FR.*;


public class PagingBtn extends JPanel {
    private static final long serialVersionUID = 1L;
    public static ArrayList<JButton> btnList = new ArrayList<JButton>();
    static {
        for(int i=1; i<=SIZE_ITEM; i++) {
            btnList.add(new JButton(""+i));
        }
    }

    public PagingBtn() {
        for(int i=0; i<9; i++) {
            add(btnList.get(i));

            btnList.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource() instanceof JButton) { // e.getsource로 받아온 객체가 JButton의 상속을 받으면 true 반환
                        // instanceof : 객체타입을 확인하는 연산자로 형변환 가능 여부를 확인하며 true, false 로 반환 주로 상속관계에서 부모객체인지 자식객체인지 확인하는데 사용
                        JButton btn = (JButton)e.getSource();   // e.getsource로 받아온 객체의 속성을 btn에 담는다.
                        int startIndex = SIZE_ITEM * (Integer.parseInt(btn.getText())-1);
                        ReportPage.setDataListPage(startIndex, startIndex+12);
                        btn.removeActionListener(null);
                    }
                }
            });
        }
    }
}
