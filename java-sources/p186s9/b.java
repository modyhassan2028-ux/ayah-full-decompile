package p186s9;

import F1.d;
import Q2.c;
import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p110k9.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(c cVar, Throwable th) {
        if (cVar != 0) {
            if (th != null) {
                try {
                    p123m2.c.B(cVar);
                    return;
                } catch (Throwable th2) {
                    a.a(th, th2);
                    return;
                }
            }
            if (cVar instanceof AutoCloseable) {
                cVar.close();
                return;
            }
            if (cVar instanceof ExecutorService) {
                d.d((ExecutorService) cVar);
                return;
            }
            if (cVar instanceof TypedArray) {
                ((TypedArray) cVar).recycle();
                return;
            }
            if (cVar instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) cVar).release();
                return;
            }
            if (cVar instanceof MediaDrm) {
                ((MediaDrm) cVar).release();
            } else if (cVar instanceof DrmManagerClient) {
                ((DrmManagerClient) cVar).release();
            } else {
                if (!(cVar instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) cVar).release();
            }
        }
    }

    public static final int c(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i10 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i11 - i15;
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i11 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i19 + i11;
            }
        }
        return i11;
    }

    public abstract List a(String str, List list);
}
