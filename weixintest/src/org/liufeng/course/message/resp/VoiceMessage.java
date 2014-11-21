package org.liufeng.course.message.resp;

/**
 * ”Ô“Ùœ˚œ¢
 * 
 * @author lidongkui
 * @date 2014-09-11
 */
public class VoiceMessage extends BaseMessage {
	// ”Ô“Ù
	private Voice Voice;

	public Voice getVoice() {
		return Voice;
	}

	public void setVoice(Voice voice) {
		Voice = voice;
	}
}
