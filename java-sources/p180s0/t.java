package p180s0;

import android.graphics.ColorSpace;
import p187t0.c;
import p187t0.d;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static final ColorSpace a(c cVar) {
        if (j.a(cVar, d.f22532v)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (j.a(cVar, d.f22533w)) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }
}
