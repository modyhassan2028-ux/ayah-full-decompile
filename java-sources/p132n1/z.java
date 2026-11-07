package p132n1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import s1.l;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19970f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f19972i;
    public final A j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f19973k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public L f19974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f19975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f19976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f19977o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f19978p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f19979q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f19980r;

    public z(A a9, z zVar) {
        this.f19965a = -1;
        this.f19966b = false;
        this.f19967c = -1;
        this.f19968d = -1;
        this.f19969e = 0;
        this.f19970f = null;
        this.g = -1;
        this.f19971h = 400;
        this.f19972i = 0.0f;
        this.f19973k = new ArrayList();
        this.f19974l = null;
        this.f19975m = new ArrayList();
        this.f19976n = 0;
        this.f19977o = false;
        this.f19978p = -1;
        this.f19979q = 0;
        this.f19980r = 0;
        this.j = a9;
        if (zVar != null) {
            this.f19978p = zVar.f19978p;
            this.f19969e = zVar.f19969e;
            this.f19970f = zVar.f19970f;
            this.g = zVar.g;
            this.f19971h = zVar.f19971h;
            this.f19973k = zVar.f19973k;
            this.f19972i = zVar.f19972i;
            this.f19979q = zVar.f19979q;
        }
    }

    public z(A a9, Context context, XmlResourceParser xmlResourceParser) {
        this.f19965a = -1;
        this.f19966b = false;
        this.f19967c = -1;
        this.f19968d = -1;
        this.f19969e = 0;
        this.f19970f = null;
        this.g = -1;
        this.f19971h = 400;
        this.f19972i = 0.0f;
        this.f19973k = new ArrayList();
        this.f19974l = null;
        this.f19975m = new ArrayList();
        this.f19976n = 0;
        this.f19977o = false;
        this.f19978p = -1;
        this.f19980r = 0;
        int i10 = a9.j;
        SparseArray sparseArray = a9.g;
        this.f19971h = i10;
        this.f19979q = a9.f19826k;
        this.j = a9;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.f22054t);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 2) {
                this.f19967c = typedArrayObtainStyledAttributes.getResourceId(index, this.f19967c);
                if ("layout".equals(context.getResources().getResourceTypeName(this.f19967c))) {
                    l lVar = new l();
                    lVar.h(context, this.f19967c);
                    sparseArray.append(this.f19967c, lVar);
                }
            } else if (index == 3) {
                this.f19968d = typedArrayObtainStyledAttributes.getResourceId(index, this.f19968d);
                if ("layout".equals(context.getResources().getResourceTypeName(this.f19968d))) {
                    l lVar2 = new l();
                    lVar2.h(context, this.f19968d);
                    sparseArray.append(this.f19968d, lVar2);
                }
            } else if (index == 6) {
                int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i12 == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.g = resourceId;
                    if (resourceId != -1) {
                        this.f19969e = -2;
                    }
                } else if (i12 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f19970f = string;
                    if (string.indexOf("/") > 0) {
                        this.g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f19969e = -2;
                    } else {
                        this.f19969e = -1;
                    }
                } else {
                    this.f19969e = typedArrayObtainStyledAttributes.getInteger(index, this.f19969e);
                }
            } else if (index == 4) {
                this.f19971h = typedArrayObtainStyledAttributes.getInt(index, this.f19971h);
            } else if (index == 8) {
                this.f19972i = typedArrayObtainStyledAttributes.getFloat(index, this.f19972i);
            } else if (index == 1) {
                this.f19976n = typedArrayObtainStyledAttributes.getInteger(index, this.f19976n);
            } else if (index == 0) {
                this.f19965a = typedArrayObtainStyledAttributes.getResourceId(index, this.f19965a);
            } else if (index == 9) {
                this.f19977o = typedArrayObtainStyledAttributes.getBoolean(index, this.f19977o);
            } else if (index == 7) {
                this.f19978p = typedArrayObtainStyledAttributes.getInteger(index, -1);
            } else if (index == 5) {
                this.f19979q = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 10) {
                this.f19980r = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.f19968d == -1) {
            this.f19966b = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
