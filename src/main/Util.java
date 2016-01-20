package main;

import java.util.BitSet;

public final class Util {
    private Util() {
    }

    public static BitSet increment(BitSet set, int totalBits) {
        boolean carry = true;
        int place = totalBits - 1;
        while (carry && place >= 0) {
            carry = set.get(place);
            set.set(place, !set.get(place));
            place--;
        }
        return set;
    }

    public static boolean DirectSum(BitSet set, int totalBits) {
        boolean acc = false;
        for (int i = 0; i < totalBits; i++) {
            acc ^= set.get(i);
        }
        return acc;
    }

    public static int toInteger(BitSet set, int totalBits) {
        int acc = 0;
        for (int i = 0; i < totalBits; i++) {
            acc += ((set.get(totalBits - i - 1)) ? 1 : 0) << i;
        }
        return acc;
    }

    public static BitSet toBitSet(int value, int totalBits) {
        int idx = totalBits - 1;
        BitSet result = new BitSet();
        while (value > 0) {
            result.set(idx--, value % 2 == 1);
            value /= 2;
        }
        return result;
    }

    public static boolean equalsBitSet(BitSet a, BitSet b, int totalBits) {
        for (int i = 0; i < totalBits; i++) {
            boolean ca = a.get(i);
            boolean cb = b.get(i);
            if (ca != cb)
                return false;
        }
        return true;
    }

    public static BitSet copyBitSet(BitSet set, int totalBits) {
        BitSet newset = new BitSet();
        for (int i = 0; i < totalBits; i++) {
            newset.set(i, set.get(i));
        }
        return newset;

    }

    public static BitSet concatenate(BitSet a, int totalBitsA, BitSet b,
                                     int totalBitsB) {
        for (int i = 0; i < totalBitsB; i++) {
            a.set(totalBitsA + i, b.get(i));
        }
        return a;
    }

    public static BitSet concatenate(BitSet[] sets, int totalBitsEach) {
        BitSet result = new BitSet(sets.length * totalBitsEach);
        for (int i = 0; i < sets.length; i++) {
            for (int j = 0; j < totalBitsEach; j++) {
                result.set((i * totalBitsEach) + j, sets[i].get(j));
            }
        }
        return result;
    }

    public static void printBitSet(BitSet set, int totalBits) {
        int ptr = 0;
        while (ptr < totalBits) {
            int val = Util.toInteger(set.get(ptr, ptr + 4), 4);
            System.out.print(Integer.toHexString(val).toUpperCase());

            ptr += 4;
        }
        System.out.println();
    }
}
