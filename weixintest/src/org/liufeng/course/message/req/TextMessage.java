package org.liufeng.course.message.req;

/**
 * 文本消息
 * 
 * @author luoguimu
 * @date 2014-09-11
 */
public class TextMessage extends BaseMessage {
	// 消息内容
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
}
