package G5;

import K9.AbstractC0405x;
import K9.C0401t;
import N9.AbstractC0419l;
import N9.InterfaceC0415h;
import N9.T;
import N9.U;
import N9.Y;
import N9.k0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p218w3.f f2902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z3.f f2903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p218w3.h f2904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p218w3.j f2905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p189t3.b f2906f;
    public final BitmapFactory.Options g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k0 f2907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final U f2908i;
    public final Y j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final T f2909k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC0415h f2910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final P9.d f2911m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f2912n;

    public j(Context context, p218w3.f fVar, z3.f fVar2, p218w3.h hVar, p218w3.j jVar, p189t3.b bVar) {
        p251z9.j.e(fVar, "pageModel");
        p251z9.j.e(fVar2, "markersModel");
        p251z9.j.e(hVar, "selectionModel");
        p251z9.j.e(jVar, "suraModel");
        p251z9.j.e(bVar, "khatmahModel");
        this.f2901a = context;
        this.f2902b = fVar;
        this.f2903c = fVar2;
        this.f2904d = hVar;
        this.f2905e = jVar;
        this.f2906f = bVar;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ALPHA_8;
        this.g = options;
        k0 k0VarC = AbstractC0419l.c(null);
        this.f2907h = k0VarC;
        this.f2908i = new U(k0VarC);
        Y yB = AbstractC0419l.b(1, 1, M9.a.f5831s);
        this.j = yB;
        this.f2909k = new T(yB);
        this.f2910l = fVar.f23666b.f4313h;
        this.f2911m = AbstractC0405x.z(AbstractC0405x.d(), new C0401t("QuranPageViewModel"));
    }
}
