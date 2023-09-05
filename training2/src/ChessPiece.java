public class ChessPiece {
    public abstract class AbstractChessPiece implements ChessPiece {
        private int row;
        private int column;
        private Color color;


        /**
         * Constructer
         *         public AbstractChessPiece(int row, int column, ChessPiece.Color color) {
         *             this.row = row;
         *             this.column = column;
         *             this.color = color;
         *         }
         * 不可让其他method调用，故为protected
         * */
        protected AbstractChessPiece(int row, int column, Color color) {
            //verifyRowandColumn(row, column);
            this.row = row;
            this.column = column;
            this.color = color;
        }



        /**
         * (a)return its current position on the chess board, as methods getRow() and getColumn()
         * (b) return its color
         * */
        public int getRow() {
            return this.row;
        }

        public int getColumn() {
            return this.column;
        }

        public Color getColor() {
            return this.color;
        }


        /**
         *(c) determine if it can move to a given cell, as a method canMove(int row,int col),
         * */

        protected boolean ifValid (int n) {
            return n >= 0 && n <= 7;
        }

        protected void verifyRowAndColumn (int row, int column) {
            if (!ifValid(row) || !ifValid(column)) {
                throw new IllegalArgumentException ("Invalid Move");
            }
        }

        public boolean canMove(int row, int column) {
            verifyRowAndColumn(row, column);
            return true;
        }

        /**
         * (d) determine if it can kill a provided piece starting from where it currently is,
         * as a method canKill(ChessPiece piece).
         * */
        public boolean canKill(ChessPiece piece) {
            return piece.getColor() != this.getColor();
        }
    }


    /**
     * Chesses
     * */
    public class Bishop extends AbstractChessPiece {


        public Bishop(int row, int column, Color color) {
            super(row, column, color);
        }

        @Override
        public boolean canMove(int row, int column) {
            return super.canMove(row, column) && this.getRow() != row && this.getColumn() != column && Math.abs(row - this.getRow()) == Math.abs(column - this.getColumn());
        }

        @Override
        public boolean canKill(ChessPiece piece) {
            return super.canKill(piece) && canMove(piece.getRow(), piece.getColumn());
        }

    }

    public interface ChessPiece {
        int getRow();
        int getColumn();
        Color getColor();
        boolean canMove(int row, int column);
        boolean canKill(ChessPiece piece);
    }

    public enum Color {
        BLACK, WHITE
    }

    public class Knight extends AbstractChessPiece {

        public Knight (int row, int column, Color color) {
            super(row, column, color);
        }

        @Override
        public boolean canMove(int row, int column) {
            return super.canMove(row, column) && Math.abs(this.getRow() - row) * Math.abs(this.getColumn() - column) == 2 ;
        }

        @Override
        public boolean canKill(ChessPiece piece) {
            return super.canKill(piece) && canMove(piece.getRow(), piece.getColumn());
        }
    }

    public class Pawn extends AbstractChessPiece {
        public Pawn(int row, int column, Color color) {
            super(row, column, color);
        }

        @Override
        public boolean canMove(int row, int column) {
            return super.canMove(row, column) && this.getColumn() == column && row - this.getRow() == 1 ;
        }

        @Override
        public boolean canKill(ChessPiece piece) {
            return super.canKill(piece) && piece.getRow() - this.getRow() == 1 && Math.abs(this.getColumn() - piece.getColumn()) == 1;
        }
    }

    public class Queen extends AbstractChessPiece {
        private Rook rook;
        private Bishop bishop;

        public Queen (int row, int column, Color color) {
            super(row, column, color);
            this.rook = new Rook(row, column, color);
            this.bishop = new Bishop(row, column, color);
        }

        @Override
        public boolean canMove(int row, int column) {
            return super.canMove(row, column) && (rook.canMove(row, column) || bishop.canMove(row, column));
        }

        @Override
        public boolean canKill(ChessPiece piece) {
            return super.canKill(piece) && canMove(piece.getRow(), piece.getColumn());
        }
    }

    public class Rook extends AbstractChessPiece {
        public Rook (int row, int column, Color color) {
            super(row, column, color);
        }

        @Override
        public boolean canMove (int row, int column) {
            return super.canMove(row, column) && (this.getRow() == row || this.getColumn() == column);
        }

        @Override
        public boolean canKill(ChessPiece piece) {
            return super.canKill(piece) && canMove(piece.getRow(), piece.getColumn());
        }

    }
}
