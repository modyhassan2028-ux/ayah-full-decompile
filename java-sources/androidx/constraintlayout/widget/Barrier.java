package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import p153p1.a;
import p153p1.e;
import p153p1.f;
import p153p1.j;
import s1.g;
import s1.h;
import s1.m;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public a f12257A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12258y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12259z;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f12257A = new a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f22038b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 15) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 14) {
                    this.f12257A.f20823j0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.f12257A.f20824k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
        }
        this.f12263u = this.f12257A;
        l();
    }

    public int getMargin() {
        return this.f12257A.f20824k0;
    }

    public int getType() {
        return this.f12258y;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void h(g gVar, j jVar, m mVar, SparseArray sparseArray) {
        super.h(gVar, jVar, mVar, sparseArray);
        h hVar = gVar.f21936d;
        if (jVar instanceof a) {
            a aVar = (a) jVar;
            m(aVar, hVar.f21964b0, ((f) jVar.f20861K).f20906k0);
            aVar.f20823j0 = hVar.f21978j0;
            aVar.f20824k0 = hVar.f21966c0;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void i(e eVar, boolean z10) {
        m(eVar, this.f12258y, z10);
    }

    public final void m(e eVar, int i10, boolean z10) {
        this.f12259z = i10;
        if (z10) {
            int i11 = this.f12258y;
            if (i11 == 5) {
                this.f12259z = 1;
            } else if (i11 == 6) {
                this.f12259z = 0;
            }
        } else {
            int i12 = this.f12258y;
            if (i12 == 5) {
                this.f12259z = 0;
            } else if (i12 == 6) {
                this.f12259z = 1;
            }
        }
        if (eVar instanceof a) {
            ((a) eVar).f20822i0 = this.f12259z;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f12257A.f20823j0 = z10;
    }

    public void setDpMargin(int i10) {
        this.f12257A.f20824k0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f12257A.f20824k0 = i10;
    }

    public void setType(int i10) {
        this.f12258y = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setVisibility(8);
    }
}
