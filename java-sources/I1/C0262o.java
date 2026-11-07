package I1;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: I1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0262o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f3765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f3766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f3767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f3769e;

    public C0262o(View view) {
        this.f3767c = view;
    }

    public final boolean a(float f3, float f7, boolean z10) {
        ViewParent viewParentE;
        if (this.f3768d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f3767c, f3, f7, z10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e10);
            }
        }
        return false;
    }

    public final boolean b(float f3, float f7) {
        ViewParent viewParentE;
        if (this.f3768d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f3767c, f3, f7);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e10);
            }
        }
        return false;
    }

    public final boolean c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent viewParentE;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f3768d || (viewParentE = e(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f3767c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f3769e == null) {
                this.f3769e = new int[2];
            }
            iArr3 = this.f3769e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z10 = viewParentE instanceof InterfaceC0263p;
        View view2 = this.f3767c;
        if (z10) {
            ((InterfaceC0263p) viewParentE).b(view2, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                viewParentE.onNestedPreScroll(view2, i10, i11, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentE;
        int i15;
        int i16;
        int[] iArr3;
        if (this.f3768d && (viewParentE = e(i14)) != null) {
            if (i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
                View view = this.f3767c;
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    i15 = iArr[0];
                    i16 = iArr[1];
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                if (iArr2 == null) {
                    if (this.f3769e == null) {
                        this.f3769e = new int[2];
                    }
                    int[] iArr4 = this.f3769e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                boolean z10 = viewParentE instanceof InterfaceC0264q;
                View view2 = this.f3767c;
                if (z10) {
                    ((InterfaceC0264q) viewParentE).g(view2, i10, i11, i12, i13, i14, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i12;
                    iArr3[1] = iArr3[1] + i13;
                    if (viewParentE instanceof InterfaceC0263p) {
                        ((InterfaceC0263p) viewParentE).i(view2, i10, i11, i12, i13, i14);
                    } else if (i14 == 0) {
                        try {
                            viewParentE.onNestedScroll(view2, i10, i11, i12, i13);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e10);
                        }
                    }
                }
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i15;
                    iArr[1] = iArr[1] - i16;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i10) {
        if (i10 == 0) {
            return this.f3765a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f3766b;
    }

    public final boolean f(int i10) {
        return e(i10) != null;
    }

    public final boolean g(int i10, int i11) {
        boolean zOnStartNestedScroll;
        if (!f(i11)) {
            if (this.f3768d) {
                View view = this.f3767c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z10 = parent instanceof InterfaceC0263p;
                    if (z10) {
                        zOnStartNestedScroll = ((InterfaceC0263p) parent).j(view2, view, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i10);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i11 == 0) {
                            this.f3765a = parent;
                        } else if (i11 == 1) {
                            this.f3766b = parent;
                        }
                        if (z10) {
                            ((InterfaceC0263p) parent).a(view2, view, i10, i11);
                        } else if (i11 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i10);
                            } catch (AbstractMethodError e11) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i10) {
        ViewParent viewParentE = e(i10);
        if (viewParentE != null) {
            boolean z10 = viewParentE instanceof InterfaceC0263p;
            View view = this.f3767c;
            if (z10) {
                ((InterfaceC0263p) viewParentE).f(i10, view);
            } else if (i10 == 0) {
                try {
                    viewParentE.onStopNestedScroll(view);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 == 0) {
                this.f3765a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f3766b = null;
            }
        }
    }
}
