package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

        String result;
        switch (handSign) {
            case ROCK:
                result = PAPER.toString();
                break;
            case PAPER:
                result = SCISSOR.toString();
                break;
            case SCISSOR:
                result = ROCK.toString();
                break;
            default:
                result = "not a hand sign";

        }
        return result;
    }


    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String result = "";
        switch (handSign){

            case ROCK :
                result = SCISSOR.toString();
                break;
            case PAPER :
                result = ROCK.toString();
                break;
            case SCISSOR:
                result = PAPER.toString();
                default:
                    result = "not a hand sign";
        }
        return result;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {




//       = assignment
//       sameness as in this object is pointing to the same location in memory
//        .equals() -- checking for equality based on business logic

        if(handSignOfPlayer1.equals(getWinningMove(handSignOfPlayer2))){
            return handSignOfPlayer1;
        } else {
            return handSignOfPlayer2;
        }
    }


    }







