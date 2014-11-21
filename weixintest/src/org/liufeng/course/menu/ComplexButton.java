package org.liufeng.course.menu;

/**
 * 复合类型的按钮
 * 
 * @author luoguimu
 * @date 2013-11-07
 */
public class ComplexButton extends Button {
	private Button[] sub_button;

	public Button[] getSub_button() {
		return sub_button;
	}

	public void setSub_button(Button[] sub_button) {
		this.sub_button = sub_button;
	}
}
