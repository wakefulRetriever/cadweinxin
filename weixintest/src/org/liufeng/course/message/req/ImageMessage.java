package org.liufeng.course.message.req;

/**
 * ͼƬ��Ϣ
 * 
 * @author luoguimu
 * @date 2014-09-11
 */
public class ImageMessage extends BaseMessage {
	// ͼƬ����
	private String PicUrl;

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
}
