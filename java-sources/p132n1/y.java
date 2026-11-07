package p132n1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public final class y implements View.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f19962r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f19963s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f19964t;

    public y(Context context, z zVar, XmlResourceParser xmlResourceParser) {
        this.f19963s = -1;
        this.f19964t = 17;
        this.f19962r = zVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.f22048n);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 1) {
                this.f19963s = typedArrayObtainStyledAttributes.getResourceId(index, this.f19963s);
            } else if (index == 0) {
                this.f19964t = typedArrayObtainStyledAttributes.getInt(index, this.f19964t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(MotionLayout motionLayout, int i10, z zVar) {
        boolean z10;
        View viewFindViewById;
        int i11 = this.f19963s;
        View view = motionLayout;
        if (i11 != -1) {
            viewFindViewById = motionLayout.findViewById(i11);
        }
        if (view == null) {
            view = viewFindViewById;
            Log.e("MotionScene", "OnClick could not find id " + i11);
            return;
        }
        int i12 = zVar.f19968d;
        int i13 = zVar.f19967c;
        if (i12 == -1) {
            view = viewFindViewById;
            view.setOnClickListener(this);
            return;
        }
        int i14 = this.f19964t;
        int i15 = i14 & 1;
        boolean z11 = false;
        if (i15 == 0 || i10 != i12) {
            view = viewFindViewById;
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z12 = (i15 != 0 && i10 == i12) | z10 | ((i14 & 256) != 0 && i10 == i12) | ((i14 & 16) != 0 && i10 == i13);
        if ((i14 & 4096) != 0 && i10 == i13) {
            z11 = true;
        }
        if (z12 || z11) {
            view.setOnClickListener(this);
        }
    }

    public final void b(MotionLayout motionLayout) {
        int i10 = this.f19963s;
        if (i10 == -1) {
            return;
        }
        View viewFindViewById = motionLayout.findViewById(i10);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(null);
            return;
        }
        Log.e("MotionScene", " (*)  could not find id " + i10);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        z zVar = this.f19962r;
        A a9 = zVar.j;
        MotionLayout motionLayout = a9.f19818a;
        if (motionLayout.f12189P) {
            if (zVar.f19968d == -1) {
                int currentState = motionLayout.getCurrentState();
                if (currentState == -1) {
                    motionLayout.z(zVar.f19967c);
                    return;
                }
                z zVar2 = new z(a9, zVar);
                zVar2.f19968d = currentState;
                zVar2.f19967c = zVar.f19967c;
                motionLayout.setTransition(zVar2);
                motionLayout.o(1.0f);
                return;
            }
            z zVar3 = a9.f19820c;
            int i10 = this.f19964t;
            int i11 = i10 & 1;
            boolean z10 = false;
            boolean z11 = true;
            boolean z12 = (i11 == 0 && (i10 & 256) == 0) ? false : true;
            int i12 = i10 & 16;
            if (i12 == 0 && (i10 & 4096) == 0) {
                z11 = false;
            }
            if (z12 && z11) {
                if (zVar3 != zVar) {
                    motionLayout.setTransition(zVar);
                }
                if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                    z11 = false;
                    z10 = z12;
                }
            } else {
                z10 = z12;
            }
            if (zVar != zVar3) {
                int i13 = zVar.f19967c;
                int i14 = zVar.f19968d;
                if (i14 != -1) {
                    int i15 = motionLayout.f12182L;
                    if (i15 != i14 && i15 != i13) {
                        return;
                    }
                } else if (motionLayout.f12182L == i13) {
                    return;
                }
            }
            if (z10 && i11 != 0) {
                motionLayout.setTransition(zVar);
                motionLayout.o(1.0f);
                return;
            }
            if (z11 && i12 != 0) {
                motionLayout.setTransition(zVar);
                motionLayout.o(0.0f);
            } else if (z10 && (i10 & 256) != 0) {
                motionLayout.setTransition(zVar);
                motionLayout.setProgress(1.0f);
            } else {
                if (!z11 || (i10 & 4096) == 0) {
                    return;
                }
                motionLayout.setTransition(zVar);
                motionLayout.setProgress(0.0f);
            }
        }
    }
}
