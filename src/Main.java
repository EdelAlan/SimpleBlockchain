import java.util.ArrayList;

public class Main {

    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {
        String[] transactions0 = {"max sent 1 satoshi to alibek", "sergey sent 2 satoshi to aleksandr"};
        Block genesisBlock = new Block(0, transactions0);

        String[] transactions1 = {"slim sent 1 satoshi to basta", "noggano sent 2 satoshi to guf"};
        Block block0 = new Block(genesisBlock.getBlockHash(), transactions1);

        String[] transactions2 = {"kot sent 1 satoshi to sobaka", "petuh sent 2 satoshi to osel"};
        Block block1 = new Block(block0.getBlockHash(), transactions2);

        System.out.println("Hash of genesis block: " + "\n" + genesisBlock.getBlockHash());
        System.out.println();
        System.out.println("Hash of block0: " + "\n" + block0.getBlockHash());
        System.out.println();
        System.out.println("Hash of block1: " + "\n" + block1.getBlockHash());
    }
}
