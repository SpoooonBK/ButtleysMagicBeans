package buttley.nyc.esteban.magicbeans.controller;

import buttley.nyc.esteban.magicbeans.gamelogic.GameLogic;
import buttley.nyc.esteban.magicbeans.gamelogic.Sequencer;
import buttley.nyc.esteban.magicbeans.main.MainGamePanel;
import buttley.nyc.esteban.magicbeans.model.boards.Board;
import buttley.nyc.esteban.magicbeans.model.boards.BoardPool;
import buttley.nyc.esteban.magicbeans.model.boards.BoardTypeEnum;
import buttley.nyc.esteban.magicbeans.model.boards.soundboard.SoundPool;
import buttley.nyc.esteban.magicbeans.model.boards.widgets.WidgetPool;
import buttley.nyc.esteban.magicbeans.model.characters.CharacterPool;

/**
 * Created by Spoooon on 1/19/2015.
 */
public class GameController {

    private Boolean mGameRunning = false;
    private SoundPool mSoundPool;
    private Sequencer mSequencer;
    private GameLogic mGameLogic;
    private CharacterPool mCharacterPool;
    private WidgetPool mWidgetPool;
    private BoardPool mBoardPool;
    private MainGamePanel mMainGamePanel;



    public GameController (MainGamePanel mainGamePanel){
       mMainGamePanel = mainGamePanel;
       mCharacterPool = new CharacterPool();
       mWidgetPool = new WidgetPool(mCharacterPool);
       mBoardPool =  new BoardPool(mWidgetPool);
       mGameLogic = new GameLogic();
       mainGamePanel.setCurrentBoard(loadBoard(BoardTypeEnum.GAME_LEVEL));
    }

    public Board loadBoard(BoardTypeEnum boardType) {
        return mBoardPool.getBoard(boardType);
    }

}
