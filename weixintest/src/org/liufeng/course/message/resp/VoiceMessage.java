package org.liufeng.course.message.resp;

/**
 * ������Ϣ
 * 
 * @author lidongkui
 * @date 2014-09-11
 */
public class VoiceMessage extends BaseMessage {
	// ����
	private Voice Voice;

	public Voice getVoice() {
		return Voice;
	}

	public void setVoice(Voice voice) {
		Voice = voice;
	}
}
