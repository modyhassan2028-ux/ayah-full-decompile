package androidx.media;

import Y2.d;
import android.util.SparseIntArray;
import io.realm.RealmFieldTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f12692b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f12693a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public static int c(int i10, int i11) {
        if ((i10 & 1) == 1) {
            return 7;
        }
        if ((i10 & 4) == 4) {
            return 6;
        }
        switch (i11) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return 1;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f12693a;
        if (audioAttributesImpl == null) {
            return audioAttributesCompat.f12693a == null;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f12693a);
    }

    public final int hashCode() {
        return this.f12693a.hashCode();
    }

    public final String toString() {
        return this.f12693a.toString();
    }
}
