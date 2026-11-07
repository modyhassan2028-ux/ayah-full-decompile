package p224x0;

import java.util.ArrayList;
import java.util.List;
import p120l9.r;

/* JADX INFO: renamed from: x0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1440d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f24198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f24202f;
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f24203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f24204i;
    public final ArrayList j;

    public C1440d(String str, float f3, float f7, float f10, float f11, float f12, float f13, float f14, List list, int i10) {
        str = (i10 & 1) != 0 ? "" : str;
        f3 = (i10 & 2) != 0 ? 0.0f : f3;
        f7 = (i10 & 4) != 0 ? 0.0f : f7;
        f10 = (i10 & 8) != 0 ? 0.0f : f10;
        f11 = (i10 & 16) != 0 ? 1.0f : f11;
        f12 = (i10 & 32) != 0 ? 1.0f : f12;
        f13 = (i10 & 64) != 0 ? 0.0f : f13;
        f14 = (i10 & 128) != 0 ? 0.0f : f14;
        if ((i10 & 256) != 0) {
            int i11 = G.f24154a;
            list = r.f19440r;
        }
        ArrayList arrayList = new ArrayList();
        this.f24197a = str;
        this.f24198b = f3;
        this.f24199c = f7;
        this.f24200d = f10;
        this.f24201e = f11;
        this.f24202f = f12;
        this.g = f13;
        this.f24203h = f14;
        this.f24204i = list;
        this.j = arrayList;
    }
}
