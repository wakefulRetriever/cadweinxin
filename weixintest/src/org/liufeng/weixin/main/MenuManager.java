package org.liufeng.weixin.main;

import org.liufeng.course.menu.Button;
import org.liufeng.course.menu.ClickButton;
import org.liufeng.course.menu.ComplexButton;
import org.liufeng.course.menu.Menu;
import org.liufeng.course.menu.ViewButton;
import org.liufeng.course.pojo.Token;
import org.liufeng.course.util.CommonUtil;
import org.liufeng.course.util.MenuUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * �˵���������
 * 
 * @author lidongkui
 * @date 2014-11-11
 */
public class MenuManager {
	private static Logger log = LoggerFactory.getLogger(MenuManager.class);

	/**
	 * ����˵��ṹ
	 * 
	 * @return
	 */
	private static Menu getMenu() {
		ViewButton btn11 = new ViewButton();
		btn11.setName("��̨ƻ��");
		btn11.setType("view");
		btn11.setUrl("http://www.91dzsw.com//pagehtml/ytpingguo.html");

		ViewButton btn12 = new ViewButton();
		btn12.setName("�������");
		btn12.setType("view");
		btn12.setUrl("http://www.91dzsw.com//pagehtml/zngouqi.html");

		ViewButton btn21 = new ViewButton();
		btn21.setName("������ѯ");
		btn21.setType("view");
		btn21.setUrl("http://1.lgmweixin.sinaapp.com/tt/order.html");

		ViewButton btn22 = new ViewButton();
		btn22.setName("�˺Ű�");
		btn22.setType("view");
		btn22.setUrl("http://1.lgmweixin.sinaapp.com/tt/bind.html");

		ViewButton btn31 = new ViewButton();
		btn31.setName("������֪");
		btn31.setType("view");
		btn31.setUrl("http://1.lgmweixin.sinaapp.com/tt/buyknow.html");

		ViewButton btn32 = new ViewButton();
		btn32.setName("֧������");
		btn32.setType("view");
		btn32.setUrl("http://1.lgmweixin.sinaapp.com/tt/payknow.html");

		ComplexButton mainBtn1 = new ComplexButton();
		mainBtn1.setName("������Ʒ");
		mainBtn1.setSub_button(new Button[] { btn11, btn12 });

		ComplexButton mainBtn2 = new ComplexButton();
		mainBtn2.setName("�ҵĶ���");
		mainBtn2.setSub_button(new Button[] { btn21, btn22 });

		ComplexButton mainBtn3 = new ComplexButton();
		mainBtn3.setName("ʹ����֪");
		mainBtn3.setSub_button(new Button[] { btn31, btn32 });

		Menu menu = new Menu();
		menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });

		return menu;
	}

	public static void main(String[] args) {
		// �������û�Ψһƾ֤
		String appId = "wxb414d8cfd28ae3ed";
		// �������û�Ψһƾ֤��Կ
		String appSecret = "f58483fd45cfde1a918e66df7af8c7d4";

		// ���ýӿڻ�ȡƾ֤
		Token token = CommonUtil.getToken(appId, appSecret);
		
		MenuUtil.deleteMenu(token.getAccessToken());
		if (null != token) {
			// �����˵�
			boolean result = MenuUtil.createMenu(getMenu(), token.getAccessToken());

			// �жϲ˵��������
			if (result)
				log.info("�˵������ɹ���");
			else
				log.info("�˵�����ʧ�ܣ�");
		}
	}
}
