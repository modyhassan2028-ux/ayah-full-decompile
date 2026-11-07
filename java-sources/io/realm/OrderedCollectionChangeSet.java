package io.realm;

import android.support.v4.media.session.p;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public interface OrderedCollectionChangeSet {

    public static class Range {
        public final int length;
        public final int startIndex;

        public Range(int i10, int i11) {
            this.startIndex = i10;
            this.length = i11;
        }

        public String toString() {
            Locale locale = Locale.ENGLISH;
            return p.w(this.startIndex, this.length, "startIndex: ", ", length: ");
        }
    }

    public enum State {
        INITIAL,
        UPDATE,
        ERROR
    }

    Range[] getChangeRanges();

    int[] getChanges();

    Range[] getDeletionRanges();

    int[] getDeletions();

    Throwable getError();

    Range[] getInsertionRanges();

    int[] getInsertions();

    State getState();
}
