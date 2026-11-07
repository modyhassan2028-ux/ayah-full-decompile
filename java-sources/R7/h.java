package R7;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class h extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f7294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D7.a f7295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f7296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f7297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f7298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f7299f;
    public Rect g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f7300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f7301i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f7303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f7304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f7308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Paint.Style f7309r;

    public h(o oVar) {
        this.f7296c = null;
        this.f7297d = null;
        this.f7298e = null;
        this.f7299f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.f7300h = 1.0f;
        this.f7301i = 1.0f;
        this.f7302k = 255;
        this.f7303l = 0.0f;
        this.f7304m = 0.0f;
        this.f7305n = 0;
        this.f7306o = 0;
        this.f7307p = 0;
        this.f7308q = 0;
        this.f7309r = Paint.Style.FILL_AND_STROKE;
        this.f7294a = oVar;
        this.f7295b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        i iVar = new i(this);
        iVar.f7329v = true;
        return iVar;
    }

    public h(h hVar) {
        this.f7296c = null;
        this.f7297d = null;
        this.f7298e = null;
        this.f7299f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.f7300h = 1.0f;
        this.f7301i = 1.0f;
        this.f7302k = 255;
        this.f7303l = 0.0f;
        this.f7304m = 0.0f;
        this.f7305n = 0;
        this.f7306o = 0;
        this.f7307p = 0;
        this.f7308q = 0;
        this.f7309r = Paint.Style.FILL_AND_STROKE;
        this.f7294a = hVar.f7294a;
        this.f7295b = hVar.f7295b;
        this.j = hVar.j;
        this.f7296c = hVar.f7296c;
        this.f7297d = hVar.f7297d;
        this.f7299f = hVar.f7299f;
        this.f7298e = hVar.f7298e;
        this.f7302k = hVar.f7302k;
        this.f7300h = hVar.f7300h;
        this.f7307p = hVar.f7307p;
        this.f7305n = hVar.f7305n;
        this.f7301i = hVar.f7301i;
        this.f7303l = hVar.f7303l;
        this.f7304m = hVar.f7304m;
        this.f7306o = hVar.f7306o;
        this.f7308q = hVar.f7308q;
        this.f7309r = hVar.f7309r;
        if (hVar.g != null) {
            this.g = new Rect(hVar.g);
        }
    }
}
