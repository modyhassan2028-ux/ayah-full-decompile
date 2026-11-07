package R1;

import E2.G;
import E2.RunnableC0147v;
import I1.S;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final G f7200x = new G(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7202b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f7204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f7205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f7206f;
    public float[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f7207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f7208i;
    public int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f7210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f7211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f7212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f7214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7215q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OverScroller f7216r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p000a.a f7217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f7218t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7219u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f7220v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7203c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RunnableC0147v f7221w = new RunnableC0147v(6, this);

    public c(Context context, ViewGroup viewGroup, p000a.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f7220v = viewGroup;
        this.f7217s = aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f7214p = i10;
        this.f7213o = i10;
        this.f7202b = viewConfiguration.getScaledTouchSlop();
        this.f7211m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f7212n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7216r = new OverScroller(context, f7200x);
    }

    public static boolean l(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public final void a() {
        b();
        if (this.f7201a == 2) {
            OverScroller overScroller = this.f7216r;
            overScroller.getCurrX();
            overScroller.getCurrY();
            overScroller.abortAnimation();
            this.f7217s.a0(this.f7218t, overScroller.getCurrX(), overScroller.getCurrY());
        }
        r(0);
    }

    public final void b() {
        this.f7203c = -1;
        float[] fArr = this.f7204d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f7205e, 0.0f);
            Arrays.fill(this.f7206f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.f7207h, 0);
            Arrays.fill(this.f7208i, 0);
            Arrays.fill(this.j, 0);
            this.f7209k = 0;
        }
        VelocityTracker velocityTracker = this.f7210l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7210l = null;
        }
    }

    public final void c(int i10, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f7220v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f7218t = view;
        this.f7203c = i10;
        this.f7217s.Y(view, i10);
        r(1);
    }

    public final boolean d(float f3, float f7, int i10, int i11) {
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f7);
        if ((this.f7207h[i10] & i11) != i11 || (this.f7215q & i11) == 0 || (this.j[i10] & i11) == i11 || (this.f7208i[i10] & i11) == i11) {
            return false;
        }
        float f10 = this.f7202b;
        if (fAbs <= f10 && fAbs2 <= f10) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.f7217s.getClass();
        }
        return (this.f7208i[i10] & i11) == 0 && fAbs > ((float) this.f7202b);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[RETURN] */
    public final boolean e(View view, float f3, float f7) {
        if (view != null) {
            p000a.a aVar = this.f7217s;
            boolean z10 = aVar.L(view) > 0;
            boolean z11 = aVar.M() > 0;
            if (z10 && z11) {
                float f10 = (f7 * f7) + (f3 * f3);
                int i10 = this.f7202b;
                if (f10 > i10 * i10) {
                    return true;
                }
            } else if (!z10 ? !(!z11 || Math.abs(f7) <= this.f7202b) : Math.abs(f3) > this.f7202b) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i10) {
        float[] fArr = this.f7204d;
        if (fArr != null) {
            int i11 = this.f7209k;
            int i12 = 1 << i10;
            if ((i11 & i12) != 0) {
                fArr[i10] = 0.0f;
                this.f7205e[i10] = 0.0f;
                this.f7206f[i10] = 0.0f;
                this.g[i10] = 0.0f;
                this.f7207h[i10] = 0;
                this.f7208i[i10] = 0;
                this.j[i10] = 0;
                this.f7209k = (~i12) & i11;
            }
        }
    }

    public final int g(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f7220v.getWidth();
        float f3 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / width) - 0.5f) * 0.47123894f)) * f3) + f3;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public final boolean h() {
        if (this.f7201a == 2) {
            OverScroller overScroller = this.f7216r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f7218t.getLeft();
            int top = currY - this.f7218t.getTop();
            if (left != 0) {
                View view = this.f7218t;
                WeakHashMap weakHashMap = S.f3689a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f7218t;
                WeakHashMap weakHashMap2 = S.f3689a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f7217s.a0(this.f7218t, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f7220v.post(this.f7221w);
            }
        }
        return this.f7201a == 2;
    }

    public final View i(int i10, int i11) {
        ViewGroup viewGroup = this.f7220v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f7217s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean j(int i10, int i11, int i12, int i13) {
        float f3;
        float f7;
        float f10;
        float f11;
        int left = this.f7218t.getLeft();
        int top = this.f7218t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        OverScroller overScroller = this.f7216r;
        if (i14 == 0 && i15 == 0) {
            overScroller.abortAnimation();
            r(0);
            return false;
        }
        View view = this.f7218t;
        int i16 = (int) this.f7212n;
        int i17 = (int) this.f7211m;
        int iAbs = Math.abs(i12);
        if (iAbs < i16) {
            i12 = 0;
        } else if (iAbs > i17) {
            i12 = i12 > 0 ? i17 : -i17;
        }
        int i18 = (int) this.f7212n;
        int iAbs2 = Math.abs(i13);
        if (iAbs2 < i18) {
            i13 = 0;
        } else if (iAbs2 > i17) {
            i13 = i13 > 0 ? i17 : -i17;
        }
        int iAbs3 = Math.abs(i14);
        int iAbs4 = Math.abs(i15);
        int iAbs5 = Math.abs(i12);
        int iAbs6 = Math.abs(i13);
        int i19 = iAbs5 + iAbs6;
        int i20 = iAbs3 + iAbs4;
        if (i12 != 0) {
            f3 = iAbs5;
            f7 = i19;
        } else {
            f3 = iAbs3;
            f7 = i20;
        }
        float f12 = f3 / f7;
        if (i13 != 0) {
            f10 = iAbs6;
            f11 = i19;
        } else {
            f10 = iAbs4;
            f11 = i20;
        }
        float f13 = f10 / f11;
        p000a.a aVar = this.f7217s;
        overScroller.startScroll(left, top, i14, i15, (int) ((g(i15, i13, aVar.M()) * f13) + (g(i14, i12, aVar.L(view)) * f12)));
        r(2);
        return true;
    }

    public final boolean k(int i10) {
        if ((this.f7209k & (1 << i10)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void m(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f7210l == null) {
            this.f7210l = VelocityTracker.obtain();
        }
        this.f7210l.addMovement(motionEvent);
        p000a.a aVar = this.f7217s;
        int i11 = 0;
        if (actionMasked == 0) {
            float x9 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewI = i((int) x9, (int) y10);
            p(x9, y10, pointerId);
            v(pointerId, viewI);
            if ((this.f7207h[pointerId] & this.f7215q) != 0) {
                aVar.U(pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f7201a == 1) {
                n();
            }
            b();
            return;
        }
        if (actionMasked == 2) {
            if (this.f7201a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i11 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i11);
                    if (k(pointerId2)) {
                        float x10 = motionEvent.getX(i11);
                        float y11 = motionEvent.getY(i11);
                        float f3 = x10 - this.f7204d[pointerId2];
                        float f7 = y11 - this.f7205e[pointerId2];
                        o(f3, f7, pointerId2);
                        if (this.f7201a != 1) {
                            View viewI2 = i((int) x10, (int) y11);
                            if (e(viewI2, f3, f7) && v(pointerId2, viewI2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i11++;
                }
                q(motionEvent);
                return;
            }
            if (k(this.f7203c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f7203c);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float y12 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f7206f;
                int i12 = this.f7203c;
                int i13 = (int) (x11 - fArr[i12]);
                int i14 = (int) (y12 - this.g[i12]);
                int left = this.f7218t.getLeft() + i13;
                int top = this.f7218t.getTop() + i14;
                int left2 = this.f7218t.getLeft();
                int top2 = this.f7218t.getTop();
                if (i13 != 0) {
                    left = aVar.p(left, this.f7218t);
                    WeakHashMap weakHashMap = S.f3689a;
                    this.f7218t.offsetLeftAndRight(left - left2);
                }
                if (i14 != 0) {
                    top = aVar.q(top, this.f7218t);
                    WeakHashMap weakHashMap2 = S.f3689a;
                    this.f7218t.offsetTopAndBottom(top - top2);
                }
                if (i13 != 0 || i14 != 0) {
                    aVar.a0(this.f7218t, left, top);
                }
                q(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f7201a == 1) {
                this.f7219u = true;
                aVar.b0(this.f7218t, 0.0f, 0.0f);
                this.f7219u = false;
                if (this.f7201a == 1) {
                    r(0);
                }
            }
            b();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x12 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            p(x12, y13, pointerId3);
            if (this.f7201a == 0) {
                v(pointerId3, i((int) x12, (int) y13));
                if ((this.f7207h[pointerId3] & this.f7215q) != 0) {
                    aVar.U(pointerId3);
                    return;
                }
                return;
            }
            if (l(this.f7218t, (int) x12, (int) y13)) {
                v(pointerId3, this.f7218t);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f7201a == 1 && pointerId4 == this.f7203c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f7203c) {
                    View viewI3 = i((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f7218t;
                    if (viewI3 == view && v(pointerId5, view)) {
                        i10 = this.f7203c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                n();
            }
        }
        f(pointerId4);
    }

    public final void n() {
        VelocityTracker velocityTracker = this.f7210l;
        float f3 = this.f7211m;
        velocityTracker.computeCurrentVelocity(1000, f3);
        float xVelocity = this.f7210l.getXVelocity(this.f7203c);
        float f7 = this.f7212n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f7) {
            xVelocity = 0.0f;
        } else if (fAbs > f3) {
            xVelocity = xVelocity > 0.0f ? f3 : -f3;
        }
        float yVelocity = this.f7210l.getYVelocity(this.f7203c);
        float f10 = this.f7212n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f10) {
            f3 = 0.0f;
        } else if (fAbs2 <= f3) {
            f3 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f3 = -f3;
        }
        this.f7219u = true;
        this.f7217s.b0(this.f7218t, xVelocity, f3);
        this.f7219u = false;
        if (this.f7201a == 1) {
            r(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.a] */
    /* JADX WARN: Type inference failed for: r4v2 */
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
    public final void o(float f3, float f7, int i10) {
        int i11;
        boolean zD = d(f3, f7, i10, 1);
        ?? r10 = zD;
        if (d(f7, f3, i10, 4)) {
            r10 = (zD ? 1 : 0) | 4;
        }
        ?? r11 = r10;
        if (d(f3, f7, i10, 2)) {
            r11 = (r10 == true ? 1 : 0) | 2;
        }
        ?? r12 = r11;
        if (d(f7, f3, i10, 8)) {
            i11 = (r11 == true ? 1 : 0) | 8;
        }
        if (r12 == 0) {
            r12 = i11;
            return;
        }
        r12 = i11;
        int[] iArr = this.f7208i;
        iArr[i10] = (iArr[i10] | r12) == true ? 1 : 0;
        this.f7217s.T(r12, i10);
    }

    public final void p(float f3, float f7, int i10) {
        float[] fArr = this.f7204d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f7205e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f7206f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f7207h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f7208i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f7204d = fArr2;
            this.f7205e = fArr3;
            this.f7206f = fArr4;
            this.g = fArr5;
            this.f7207h = iArr;
            this.f7208i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f7204d;
        this.f7206f[i10] = f3;
        fArr9[i10] = f3;
        float[] fArr10 = this.f7205e;
        this.g[i10] = f7;
        fArr10[i10] = f7;
        int[] iArr7 = this.f7207h;
        int i12 = (int) f3;
        int i13 = (int) f7;
        ViewGroup viewGroup = this.f7220v;
        int i14 = i12 < viewGroup.getLeft() + this.f7213o ? 1 : 0;
        if (i13 < viewGroup.getTop() + this.f7213o) {
            i14 |= 4;
        }
        if (i12 > viewGroup.getRight() - this.f7213o) {
            i14 |= 2;
        }
        if (i13 > viewGroup.getBottom() - this.f7213o) {
            i14 |= 8;
        }
        iArr7[i10] = i14;
        this.f7209k |= 1 << i10;
    }

    public final void q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (k(pointerId)) {
                float x9 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f7206f[pointerId] = x9;
                this.g[pointerId] = y10;
            }
        }
    }

    public final void r(int i10) {
        this.f7220v.removeCallbacks(this.f7221w);
        if (this.f7201a != i10) {
            this.f7201a = i10;
            this.f7217s.Z(i10);
            if (this.f7201a == 0) {
                this.f7218t = null;
            }
        }
    }

    public final boolean s(int i10, int i11) {
        if (this.f7219u) {
            return j(i10, i11, (int) this.f7210l.getXVelocity(this.f7203c), (int) this.f7210l.getYVelocity(this.f7203c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    public final boolean t(MotionEvent motionEvent) {
        View viewI;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f7210l == null) {
            this.f7210l = VelocityTracker.obtain();
        }
        this.f7210l.addMovement(motionEvent);
        p000a.a aVar = this.f7217s;
        if (actionMasked == 0) {
            float x9 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            p(x9, y10, pointerId);
            View viewI2 = i((int) x9, (int) y10);
            if (viewI2 == this.f7218t && this.f7201a == 2) {
                v(pointerId, viewI2);
            }
            if ((this.f7207h[pointerId] & this.f7215q) != 0) {
                aVar.U(pointerId);
            }
        } else if (actionMasked == 1) {
            b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x10 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                p(x10, y11, pointerId2);
                int i10 = this.f7201a;
                if (i10 == 0) {
                    if ((this.f7207h[pointerId2] & this.f7215q) != 0) {
                        aVar.U(pointerId2);
                    }
                } else if (i10 == 2 && (viewI = i((int) x10, (int) y11)) == this.f7218t) {
                    v(pointerId2, viewI);
                }
            } else if (actionMasked == 6) {
                f(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f7204d != null && this.f7205e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i11 = 0; i11 < pointerCount; i11++) {
                int pointerId3 = motionEvent.getPointerId(i11);
                if (k(pointerId3)) {
                    float x11 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f3 = x11 - this.f7204d[pointerId3];
                    float f7 = y12 - this.f7205e[pointerId3];
                    View viewI3 = i((int) x11, (int) y12);
                    boolean z10 = viewI3 != null && e(viewI3, f3, f7);
                    if (!z10) {
                        o(f3, f7, pointerId3);
                        if (this.f7201a != 1) {
                            break;
                        }
                    } else {
                        int left = viewI3.getLeft();
                        int iP = aVar.p(((int) f3) + left, viewI3);
                        int top = viewI3.getTop();
                        int iQ = aVar.q(((int) f7) + top, viewI3);
                        int iL = aVar.L(viewI3);
                        int iM = aVar.M();
                        if ((iL == 0 || (iL > 0 && iP == left)) && (iM == 0 || (iM > 0 && iQ == top))) {
                            break;
                        }
                        o(f3, f7, pointerId3);
                        if (this.f7201a != 1 || (z10 && v(pointerId3, viewI3))) {
                            break;
                        }
                    }
                }
            }
            q(motionEvent);
        }
        return this.f7201a == 1;
    }

    public final boolean u(View view, int i10, int i11) {
        this.f7218t = view;
        this.f7203c = -1;
        boolean zJ = j(i10, i11, 0, 0);
        if (!zJ && this.f7201a == 0 && this.f7218t != null) {
            this.f7218t = null;
        }
        return zJ;
    }

    public final boolean v(int i10, View view) {
        if (view == this.f7218t && this.f7203c == i10) {
            return true;
        }
        if (view == null || !this.f7217s.o0(i10, view)) {
            return false;
        }
        this.f7203c = i10;
        c(i10, view);
        return true;
    }
}
