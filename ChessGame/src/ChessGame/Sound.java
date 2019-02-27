package ChessGame;

import java.applet.Applet;
import java.applet.AudioClip;

/**
 * Sound class: all the different sounds that will be used in the game
 * @author Gloria Garza
 *
 */
public class Sound {
	public static final AudioClip CHECK = Applet.newAudioClip(Sound.class.getResource("check.wav"));
	public static final AudioClip CHECKMATE = Applet.newAudioClip(Sound.class.getResource("checkmate.wav"));
	public static final AudioClip ONEPLAY = Applet.newAudioClip(Sound.class.getResource("oneplay.wav"));
	public static final AudioClip ONETURN = Applet.newAudioClip(Sound.class.getResource("oneturn.wav"));
	public static final AudioClip ONEWINS = Applet.newAudioClip(Sound.class.getResource("onewins.wav"));
	public static final AudioClip TWOPLAY = Applet.newAudioClip(Sound.class.getResource("twoplay.wav"));
	public static final AudioClip TWOTURN = Applet.newAudioClip(Sound.class.getResource("twoturn.wav"));
	public static final AudioClip TWOWINS = Applet.newAudioClip(Sound.class.getResource("twowins.wav"));
	public static final AudioClip TADAWIN = Applet.newAudioClip(Sound.class.getResource("tadawin.wav"));
	public static final AudioClip COMPUTERTURN = Applet.newAudioClip(Sound.class.getResource("computerturn.wav"));
	public static final AudioClip COMPUTERWINS = Applet.newAudioClip(Sound.class.getResource("computerwins.wav"));
	public static final AudioClip ITSADRAW = Applet.newAudioClip(Sound.class.getResource("itsadraw.wav"));
}