package X2;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f9886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f9890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f9891f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f9892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f9893i;
    public final Matrix j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f9894k;

    public j() {
        this.f9886a = new Matrix();
        this.f9887b = new ArrayList();
        this.f9888c = 0.0f;
        this.f9889d = 0.0f;
        this.f9890e = 0.0f;
        this.f9891f = 1.0f;
        this.g = 1.0f;
        this.f9892h = 0.0f;
        this.f9893i = 0.0f;
        this.j = new Matrix();
        this.f9894k = null;
    }

    @Override // X2.k
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9887b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i10)).a()) {
                return true;
            }
            i10++;
        }
    }

    @Override // X2.k
    public final boolean b(int[] iArr) {
        int i10 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f9887b;
            if (i10 >= arrayList.size()) {
                return zB;
            }
            zB |= ((k) arrayList.get(i10)).b(iArr);
            i10++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.f9889d, -this.f9890e);
        matrix.postScale(this.f9891f, this.g);
        matrix.postRotate(this.f9888c, 0.0f, 0.0f);
        matrix.postTranslate(this.f9892h + this.f9889d, this.f9893i + this.f9890e);
    }

    public String getGroupName() {
        return this.f9894k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.f9889d;
    }

    public float getPivotY() {
        return this.f9890e;
    }

    public float getRotation() {
        return this.f9888c;
    }

    public float getScaleX() {
        return this.f9891f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.f9892h;
    }

    public float getTranslateY() {
        return this.f9893i;
    }

    public void setPivotX(float f3) {
        if (f3 != this.f9889d) {
            this.f9889d = f3;
            c();
        }
    }

    public void setPivotY(float f3) {
        if (f3 != this.f9890e) {
            this.f9890e = f3;
            c();
        }
    }

    public void setRotation(float f3) {
        if (f3 != this.f9888c) {
            this.f9888c = f3;
            c();
        }
    }

    public void setScaleX(float f3) {
        if (f3 != this.f9891f) {
            this.f9891f = f3;
            c();
        }
    }

    public void setScaleY(float f3) {
        if (f3 != this.g) {
            this.g = f3;
            c();
        }
    }

    public void setTranslateX(float f3) {
        if (f3 != this.f9892h) {
            this.f9892h = f3;
            c();
        }
    }

    public void setTranslateY(float f3) {
        if (f3 != this.f9893i) {
            this.f9893i = f3;
            c();
        }
    }

    public j(j jVar, C1350e c1350e) {
        l hVar;
        this.f9886a = new Matrix();
        this.f9887b = new ArrayList();
        this.f9888c = 0.0f;
        this.f9889d = 0.0f;
        this.f9890e = 0.0f;
        this.f9891f = 1.0f;
        this.g = 1.0f;
        this.f9892h = 0.0f;
        this.f9893i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.f9894k = null;
        this.f9888c = jVar.f9888c;
        this.f9889d = jVar.f9889d;
        this.f9890e = jVar.f9890e;
        this.f9891f = jVar.f9891f;
        this.g = jVar.g;
        this.f9892h = jVar.f9892h;
        this.f9893i = jVar.f9893i;
        String str = jVar.f9894k;
        this.f9894k = str;
        if (str != null) {
            c1350e.put(str, this);
        }
        matrix.set(jVar.j);
        ArrayList arrayList = jVar.f9887b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f9887b.add(new j((j) obj, c1350e));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    i iVar2 = new i(iVar);
                    iVar2.f9878e = 0.0f;
                    iVar2.g = 1.0f;
                    iVar2.f9880h = 1.0f;
                    iVar2.f9881i = 0.0f;
                    iVar2.j = 1.0f;
                    iVar2.f9882k = 0.0f;
                    iVar2.f9883l = Paint.Cap.BUTT;
                    iVar2.f9884m = Paint.Join.MITER;
                    iVar2.f9885n = 4.0f;
                    iVar2.f9877d = iVar.f9877d;
                    iVar2.f9878e = iVar.f9878e;
                    iVar2.g = iVar.g;
                    iVar2.f9879f = iVar.f9879f;
                    iVar2.f9897c = iVar.f9897c;
                    iVar2.f9880h = iVar.f9880h;
                    iVar2.f9881i = iVar.f9881i;
                    iVar2.j = iVar.j;
                    iVar2.f9882k = iVar.f9882k;
                    iVar2.f9883l = iVar.f9883l;
                    iVar2.f9884m = iVar.f9884m;
                    iVar2.f9885n = iVar.f9885n;
                    hVar = iVar2;
                } else if (obj instanceof h) {
                    hVar = new h((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f9887b.add(hVar);
                Object obj2 = hVar.f9896b;
                if (obj2 != null) {
                    c1350e.put(obj2, hVar);
                }
            }
        }
    }
}
