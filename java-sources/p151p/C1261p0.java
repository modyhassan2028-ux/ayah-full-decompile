package p151p;

import E2.RunnableC0147v;
import N1.e;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.ayah.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: p.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1261p0 extends ListView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f20752A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public e f20753B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public RunnableC0147v f20754C;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f20755r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20756s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f20757t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f20758u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20759v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20760w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C1257n0 f20761x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f20762y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f20763z;

    public C1261p0(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f20755r = new Rect();
        this.f20756s = 0;
        this.f20757t = 0;
        this.f20758u = 0;
        this.f20759v = 0;
        this.f20763z = z10;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i10, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return i11;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0162  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:88:0x016b  */
    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0181  */
    /* JADX WARN: Code duplicated, block: B:94:0x0185  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final boolean b(MotionEvent motionEvent, int i10) {
        boolean z10;
        boolean zA;
        View childAt;
        View childAt2;
        e eVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z10 = true;
            } else if (actionMasked != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || z11) {
                this.f20752A = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f20760w - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z10) {
                if (this.f20753B == null) {
                    this.f20753B = new e(this);
                }
                e eVar2 = this.f20753B;
                boolean z12 = eVar2.f5981G;
                eVar2.f5981G = true;
                eVar2.onTouch(this, motionEvent);
            } else {
                eVar = this.f20753B;
                if (eVar != null) {
                    if (eVar.f5981G) {
                        eVar.d();
                    }
                    eVar.f5981G = false;
                }
            }
            return z10;
        }
        z10 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z10 = false;
        } else {
            int x9 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x9, y10);
            if (iPointToPosition == -1) {
                z11 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f3 = x9;
                float f7 = y10;
                this.f20752A = true;
                int i11 = Build.VERSION.SDK_INT;
                AbstractC1251k0.a(this, f3, f7);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i12 = this.f20760w;
                if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f20760w = iPointToPosition;
                AbstractC1251k0.a(childAt3, f3 - childAt3.getLeft(), f7 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z13 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z13) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f20755r;
                rect.set(left, top, right, bottom);
                rect.left -= this.f20756s;
                rect.top -= this.f20757t;
                rect.right += this.f20758u;
                rect.bottom += this.f20759v;
                if (i11 >= 33) {
                    zA = AbstractC1255m0.a(this);
                } else {
                    Field field = AbstractC1259o0.f20751a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z14 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC1255m0.b(this, z14);
                    } else {
                        Field field2 = AbstractC1259o0.f20751a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z14));
                            } catch (IllegalAccessException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z13) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f3, f7);
                }
                C1257n0 c1257n0 = this.f20761x;
                if (c1257n0 != null) {
                    c1257n0.f20749s = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z10 = true;
                z11 = false;
            }
        }
        if (z10) {
            this.f20752A = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f20760w - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f20752A = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f20760w - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z10) {
            if (this.f20753B == null) {
                this.f20753B = new e(this);
            }
            e eVar3 = this.f20753B;
            boolean z15 = eVar3.f5981G;
            eVar3.f5981G = true;
            eVar3.onTouch(this, motionEvent);
        } else {
            eVar = this.f20753B;
            if (eVar != null) {
                if (eVar.f5981G) {
                    eVar.d();
                }
                eVar.f5981G = false;
            }
        }
        return z10;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f20755r;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f20754C != null) {
            return;
        }
        super.drawableStateChanged();
        C1257n0 c1257n0 = this.f20761x;
        if (c1257n0 != null) {
            c1257n0.f20749s = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f20752A && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f20763z || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f20763z || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f20763z || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f20763z && this.f20762y) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f20754C = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f20754C == null) {
            RunnableC0147v runnableC0147v = new RunnableC0147v(27, this);
            this.f20754C = runnableC0147v;
            post(runnableC0147v);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 < 30 || !AbstractC1253l0.f20721d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC1253l0.f20718a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC1253l0.f20719b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC1253l0.f20720c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e10) {
                        e10.printStackTrace();
                    } catch (InvocationTargetException e11) {
                        e11.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f20752A && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f20760w = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0147v runnableC0147v = this.f20754C;
        if (runnableC0147v != null) {
            C1261p0 c1261p0 = (C1261p0) runnableC0147v.f1786s;
            c1261p0.f20754C = null;
            c1261p0.removeCallbacks(runnableC0147v);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f20762y = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1257n0 c1257n0 = null;
        if (drawable != null) {
            C1257n0 c1257n1 = new C1257n0();
            Drawable drawable2 = c1257n1.f20748r;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c1257n1.f20748r = drawable;
            drawable.setCallback(c1257n1);
            c1257n1.f20749s = true;
            c1257n0 = c1257n1;
        }
        this.f20761x = c1257n0;
        super.setSelector(c1257n0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f20756s = rect.left;
        this.f20757t = rect.top;
        this.f20758u = rect.right;
        this.f20759v = rect.bottom;
    }
}
