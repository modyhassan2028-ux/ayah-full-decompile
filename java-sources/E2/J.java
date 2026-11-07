package E2;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC0131k0 implements InterfaceC0139o0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Rect f1515A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f1516B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1522f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f1523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f1524i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1525k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Q5.a f1527m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1529o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1531q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f1532r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VelocityTracker f1534t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f1535u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f1536v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public GestureDetector f1538x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public I f1539y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1517a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f1518b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F0 f1519c = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1526l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1528n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f1530p = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RunnableC0147v f1533s = new RunnableC0147v(1, this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f1537w = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final E f1540z = new E(this);

    public J(Q5.a aVar) {
        this.f1527m = aVar;
    }

    public static boolean o(View view, float f3, float f7, float f10, float f11) {
        return f3 >= f10 && f3 <= f10 + ((float) view.getWidth()) && f7 >= f11 && f7 <= f11 + ((float) view.getHeight());
    }

    @Override // E2.InterfaceC0139o0
    public final void d(View view) {
        q(view);
        F0 f0O = this.f1532r.O(view);
        if (f0O == null) {
            return;
        }
        F0 f3 = this.f1519c;
        if (f3 != null && f0O == f3) {
            r(null, 0);
            return;
        }
        l(f0O, false);
        if (this.f1517a.remove(f0O.f1486a)) {
            this.f1527m.getClass();
            H.a(f0O);
        }
    }

    @Override // E2.AbstractC0131k0
    public final void f(Rect rect, View view, RecyclerView recyclerView, B0 b5) {
        rect.setEmpty();
    }

    @Override // E2.AbstractC0131k0
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        float f3;
        float f7;
        if (this.f1519c != null) {
            float[] fArr = this.f1518b;
            n(fArr);
            float f10 = fArr[0];
            f3 = fArr[1];
            f7 = f10;
        } else {
            f3 = 0.0f;
            f7 = 0.0f;
        }
        F0 f11 = this.f1519c;
        Q5.a aVar = this.f1527m;
        aVar.getClass();
        ArrayList arrayList = this.f1530p;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            F f12 = (F) arrayList.get(i10);
            F0 f13 = f12.f1475e;
            float f14 = f12.f1471a;
            float f15 = f12.f1473c;
            if (f14 == f15) {
                f12.f1478i = f13.f1486a.getTranslationX();
            } else {
                f12.f1478i = android.support.v4.media.session.p.n(f15, f14, f12.f1481m, f14);
            }
            float f16 = f12.f1472b;
            float f17 = f12.f1474d;
            if (f16 == f17) {
                f12.j = f13.f1486a.getTranslationY();
            } else {
                f12.j = android.support.v4.media.session.p.n(f17, f16, f12.f1481m, f16);
            }
            int iSave = canvas.save();
            aVar.f(canvas, recyclerView, f12.f1475e, f12.f1478i, f12.j, false);
            canvas.restoreToCount(iSave);
        }
        if (f11 != null) {
            int iSave2 = canvas.save();
            aVar.f(canvas, recyclerView, f11, f7, f3, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // E2.AbstractC0131k0
    public final void h(Canvas canvas, RecyclerView recyclerView, B0 b5) {
        boolean z10 = false;
        if (this.f1519c != null) {
            float[] fArr = this.f1518b;
            n(fArr);
            float f3 = fArr[0];
            float f7 = fArr[1];
        }
        F0 f10 = this.f1519c;
        this.f1527m.getClass();
        ArrayList arrayList = this.f1530p;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            F f11 = (F) arrayList.get(i10);
            int iSave = canvas.save();
            View view = f11.f1475e.f1486a;
            canvas.restoreToCount(iSave);
        }
        if (f10 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            F f12 = (F) arrayList.get(i11);
            boolean z11 = f12.f1480l;
            if (z11 && !f12.f1477h) {
                arrayList.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final int i(int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = this.f1523h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f1534t;
        Q5.a aVar = this.f1527m;
        if (velocityTracker != null && this.f1526l > -1) {
            float f3 = this.g;
            aVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f3);
            float xVelocity = this.f1534t.getXVelocity(this.f1526l);
            float yVelocity = this.f1534t.getYVelocity(this.f1526l);
            int i12 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i12 & i10) != 0 && i11 == i12 && fAbs >= this.f1522f && fAbs > Math.abs(yVelocity)) {
                return i12;
            }
        }
        float width = this.f1532r.getWidth();
        aVar.getClass();
        float f7 = width * 0.5f;
        if ((i10 & i11) == 0 || Math.abs(this.f1523h) <= f7) {
            return 0;
        }
        return i11;
    }

    public final void j(int i10, int i11, MotionEvent motionEvent) {
        View viewM;
        if (this.f1519c == null && i10 == 2 && this.f1528n != 2) {
            Q5.a aVar = this.f1527m;
            aVar.getClass();
            if (this.f1532r.getScrollState() == 1) {
                return;
            }
            AbstractC0135m0 layoutManager = this.f1532r.getLayoutManager();
            int i12 = this.f1526l;
            F0 f0O = null;
            if (i12 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i12);
                float x9 = motionEvent.getX(iFindPointerIndex) - this.f1520d;
                float y10 = motionEvent.getY(iFindPointerIndex) - this.f1521e;
                float fAbs = Math.abs(x9);
                float fAbs2 = Math.abs(y10);
                float f3 = this.f1531q;
                if ((fAbs >= f3 || fAbs2 >= f3) && ((fAbs <= fAbs2 || !layoutManager.e()) && ((fAbs2 <= fAbs || !layoutManager.f()) && (viewM = m(motionEvent)) != null))) {
                    f0O = this.f1532r.O(viewM);
                }
            }
            if (f0O == null) {
                return;
            }
            RecyclerView recyclerView = this.f1532r;
            int iB = (H.b(aVar.e(recyclerView, f0O), recyclerView.getLayoutDirection()) & 65280) >> 8;
            if (iB == 0) {
                return;
            }
            float x10 = motionEvent.getX(i11);
            float y11 = motionEvent.getY(i11);
            float f7 = x10 - this.f1520d;
            float f10 = y11 - this.f1521e;
            float fAbs3 = Math.abs(f7);
            float fAbs4 = Math.abs(f10);
            float f11 = this.f1531q;
            if (fAbs3 >= f11 || fAbs4 >= f11) {
                if (fAbs3 > fAbs4) {
                    if (f7 < 0.0f && (iB & 4) == 0) {
                        return;
                    }
                    if (f7 > 0.0f && (iB & 8) == 0) {
                        return;
                    }
                } else {
                    if (f10 < 0.0f && (iB & 1) == 0) {
                        return;
                    }
                    if (f10 > 0.0f && (iB & 2) == 0) {
                        return;
                    }
                }
                this.f1524i = 0.0f;
                this.f1523h = 0.0f;
                this.f1526l = motionEvent.getPointerId(0);
                r(f0O, 1);
            }
        }
    }

    public final int k(int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = this.f1524i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f1534t;
        Q5.a aVar = this.f1527m;
        if (velocityTracker != null && this.f1526l > -1) {
            float f3 = this.g;
            aVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f3);
            float xVelocity = this.f1534t.getXVelocity(this.f1526l);
            float yVelocity = this.f1534t.getYVelocity(this.f1526l);
            int i12 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11 && fAbs >= this.f1522f && fAbs > Math.abs(xVelocity)) {
                return i12;
            }
        }
        float height = this.f1532r.getHeight();
        aVar.getClass();
        float f7 = height * 0.5f;
        if ((i10 & i11) == 0 || Math.abs(this.f1524i) <= f7) {
            return 0;
        }
        return i11;
    }

    public final void l(F0 f3, boolean z10) {
        ArrayList arrayList = this.f1530p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            F f7 = (F) arrayList.get(size);
            if (f7.f1475e == f3) {
                f7.f1479k |= z10;
                if (!f7.f1480l) {
                    f7.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View m(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y10 = motionEvent.getY();
        F0 f3 = this.f1519c;
        if (f3 != null) {
            View view = f3.f1486a;
            if (o(view, x9, y10, this.j + this.f1523h, this.f1525k + this.f1524i)) {
                return view;
            }
        }
        ArrayList arrayList = this.f1530p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            F f7 = (F) arrayList.get(size);
            View view2 = f7.f1475e.f1486a;
            if (o(view2, x9, y10, f7.f1478i, f7.j)) {
                return view2;
            }
        }
        return this.f1532r.E(x9, y10);
    }

    public final void n(float[] fArr) {
        if ((this.f1529o & 12) != 0) {
            fArr[0] = (this.j + this.f1523h) - this.f1519c.f1486a.getLeft();
        } else {
            fArr[0] = this.f1519c.f1486a.getTranslationX();
        }
        if ((this.f1529o & 3) != 0) {
            fArr[1] = (this.f1525k + this.f1524i) - this.f1519c.f1486a.getTop();
        } else {
            fArr[1] = this.f1519c.f1486a.getTranslationY();
        }
    }

    public final void p(F0 f3) {
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        if (this.f1532r.isLayoutRequested()) {
            return;
        }
        char c10 = 2;
        if (this.f1528n != 2) {
            return;
        }
        this.f1527m.getClass();
        int i10 = (int) (this.j + this.f1523h);
        int i11 = (int) (this.f1525k + this.f1524i);
        View view = f3.f1486a;
        if (Math.abs(i11 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i10 - view.getLeft()) >= view.getWidth() * 0.5f) {
            ArrayList arrayList = this.f1535u;
            if (arrayList == null) {
                this.f1535u = new ArrayList();
                this.f1536v = new ArrayList();
            } else {
                arrayList.clear();
                this.f1536v.clear();
            }
            int iRound = Math.round(this.j + this.f1523h);
            int iRound2 = Math.round(this.f1525k + this.f1524i);
            int width = view.getWidth() + iRound;
            int height = view.getHeight() + iRound2;
            int i12 = (iRound + width) / 2;
            int i13 = (iRound2 + height) / 2;
            AbstractC0135m0 layoutManager = this.f1532r.getLayoutManager();
            int iW = layoutManager.w();
            int i14 = 0;
            while (i14 < iW) {
                char c11 = c10;
                View viewV = layoutManager.v(i14);
                if (viewV != view && viewV.getBottom() >= iRound2 && viewV.getTop() <= height && viewV.getRight() >= iRound && viewV.getLeft() <= width) {
                    F0 f0O = this.f1532r.O(viewV);
                    int iAbs5 = Math.abs(i12 - ((viewV.getRight() + viewV.getLeft()) / 2));
                    int iAbs6 = Math.abs(i13 - ((viewV.getBottom() + viewV.getTop()) / 2));
                    int i15 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                    int size = this.f1535u.size();
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < size) {
                        int i18 = size;
                        if (i15 <= ((Integer) this.f1536v.get(i16)).intValue()) {
                            break;
                        }
                        i17++;
                        i16++;
                        size = i18;
                    }
                    this.f1535u.add(i17, f0O);
                    this.f1536v.add(i17, Integer.valueOf(i15));
                }
                i14++;
                c10 = c11;
                i10 = i10;
                i11 = i11;
            }
            int i19 = i10;
            int i20 = i11;
            ArrayList arrayList2 = this.f1535u;
            if (arrayList2.size() == 0) {
                return;
            }
            int width2 = view.getWidth() + i19;
            int height2 = view.getHeight() + i20;
            int left2 = i19 - view.getLeft();
            int top2 = i20 - view.getTop();
            int size2 = arrayList2.size();
            F0 f7 = null;
            int i21 = -1;
            for (int i22 = 0; i22 < size2; i22++) {
                F0 f10 = (F0) arrayList2.get(i22);
                if (left2 > 0 && (right = f10.f1486a.getRight() - width2) < 0 && f10.f1486a.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i21) {
                    f7 = f10;
                    i21 = iAbs4;
                }
                if (left2 < 0 && (left = f10.f1486a.getLeft() - i19) > 0 && f10.f1486a.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i21) {
                    f7 = f10;
                    i21 = iAbs3;
                }
                if (top2 < 0 && (top = f10.f1486a.getTop() - i20) > 0 && f10.f1486a.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i21) {
                    f7 = f10;
                    i21 = iAbs2;
                }
                if (top2 > 0 && (bottom = f10.f1486a.getBottom() - height2) < 0 && f10.f1486a.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i21) {
                    f7 = f10;
                    i21 = iAbs;
                }
            }
            if (f7 == null) {
                this.f1535u.clear();
                this.f1536v.clear();
            } else {
                f7.b();
                f3.b();
                p251z9.j.e(this.f1532r, "recyclerView");
            }
        }
    }

    public final void q(View view) {
        if (view == this.f1537w) {
            this.f1537w = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [Q5.a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [E2.F0] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [Q5.a] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r(F0 f3, int i10) {
        ?? r18;
        ?? r12;
        boolean z10;
        ?? r10;
        ?? r13;
        ?? r11;
        ?? r14;
        ?? r19;
        int iK;
        char c10;
        float fSignum;
        Object obj;
        long j;
        if (f3 == this.f1519c && i10 == this.f1528n) {
            return;
        }
        this.f1516B = Long.MIN_VALUE;
        int i11 = this.f1528n;
        l(f3, true);
        this.f1528n = i10;
        if (i10 == 2) {
            if (f3 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f1537w = f3.f1486a;
        }
        int i12 = (1 << ((i10 * 8) + 8)) - 1;
        ?? r15 = this.f1519c;
        ?? r16 = this.f1527m;
        if (r15 != 0) {
            View view = r15.f1486a;
            if (view.getParent() != null) {
                if (i11 == 2 || this.f1528n == 2) {
                    iK = 0;
                } else {
                    int iE = r16.e(this.f1532r, r15);
                    int iB = (H.b(iE, this.f1532r.getLayoutDirection()) & 65280) >> 8;
                    if (iB == 0) {
                        iK = 0;
                    } else {
                        int i13 = (iE & 65280) >> 8;
                        if (Math.abs(this.f1523h) > Math.abs(this.f1524i)) {
                            iK = i(iB);
                            if (iK <= 0) {
                                iK = k(iB);
                                if (iK <= 0) {
                                    iK = 0;
                                }
                            } else if ((i13 & iK) == 0) {
                                iK = H.c(iK, this.f1532r.getLayoutDirection());
                            }
                        } else {
                            iK = k(iB);
                            if (iK <= 0) {
                                iK = i(iB);
                                if (iK <= 0) {
                                    iK = 0;
                                } else if ((i13 & iK) == 0) {
                                    iK = H.c(iK, this.f1532r.getLayoutDirection());
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.f1534t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f1534t = null;
                }
                char c11 = 4;
                float fSignum2 = 0.0f;
                if (iK == 1 || iK == 2) {
                    c10 = 0;
                    fSignum = Math.signum(this.f1524i) * this.f1532r.getHeight();
                    obj = null;
                } else if (iK == 4 || iK == 8 || iK == 16 || iK == 32) {
                    c10 = 0;
                    obj = null;
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f1523h) * this.f1532r.getWidth();
                } else {
                    obj = null;
                    c10 = 0;
                    fSignum = 0.0f;
                }
                if (i11 == 2) {
                    c11 = '\b';
                } else if (iK > 0) {
                    c11 = 2;
                }
                float[] fArr = this.f1518b;
                n(fArr);
                ?? r110 = r16;
                char c12 = c11;
                ?? r17 = c10;
                F f7 = new F(this, r15, i11, fArr[c10], fArr[1], fSignum2, fSignum, iK, r15);
                RecyclerView recyclerView = this.f1532r;
                r110.getClass();
                AbstractC0129j0 itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator == null) {
                    j = c12 == '\b' ? 200L : 250L;
                } else {
                    j = c12 == '\b' ? itemAnimator.f1692e : itemAnimator.f1691d;
                }
                ValueAnimator valueAnimator = f7.g;
                valueAnimator.setDuration(j);
                this.f1530p.add(f7);
                r15.o(r17);
                valueAnimator.start();
                z10 = true;
                r14 = r17;
                r19 = r110;
            } else {
                ?? r111 = r16;
                r14 = 0;
                q(view);
                r111.getClass();
                H.a(r15);
                z10 = false;
                r19 = r111;
            }
            this.f1519c = null;
            r12 = r14;
            r18 = r19;
        } else {
            r18 = r16;
            r12 = 0;
            z10 = false;
        }
        if (f3 != null) {
            View view2 = f3.f1486a;
            RecyclerView recyclerView2 = this.f1532r;
            r11 = r18;
            this.f1529o = (H.b(r11.e(recyclerView2, f3), recyclerView2.getLayoutDirection()) & i12) >> (this.f1528n * 8);
            this.j = view2.getLeft();
            this.f1525k = view2.getTop();
            this.f1519c = f3;
            if (i10 == 2) {
                r10 = r11;
                view2.performHapticFeedback(r12 == true ? 1 : 0);
                r10 = r11;
            }
        } else {
            r10 = r18;
        }
        r10 = r11;
        ?? parent = this.f1532r.getParent();
        if (parent != 0) {
            if (this.f1519c != null) {
                r13 = r12;
                r13 = 1;
            }
            r13 = r12;
            parent.requestDisallowInterceptTouchEvent(r13);
        }
        if (!z10) {
            this.f1532r.getLayoutManager().f1720f = true;
        }
        r10.getClass();
        this.f1532r.invalidate();
    }

    public final void s(int i10, int i11, MotionEvent motionEvent) {
        float x9 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f3 = x9 - this.f1520d;
        this.f1523h = f3;
        this.f1524i = y10 - this.f1521e;
        if ((i10 & 4) == 0) {
            this.f1523h = Math.max(0.0f, f3);
        }
        if ((i10 & 8) == 0) {
            this.f1523h = Math.min(0.0f, this.f1523h);
        }
        if ((i10 & 1) == 0) {
            this.f1524i = Math.max(0.0f, this.f1524i);
        }
        if ((i10 & 2) == 0) {
            this.f1524i = Math.min(0.0f, this.f1524i);
        }
    }

    @Override // E2.InterfaceC0139o0
    public final void b(View view) {
    }
}
