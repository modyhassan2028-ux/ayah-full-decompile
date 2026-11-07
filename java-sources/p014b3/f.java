package p014b3;

import E2.C0137n0;
import E2.C0140p;
import E2.r0;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class f extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f13215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPager2 f13216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f13217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f13218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13220f;
    public final e g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13222i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13224l;

    public f(ViewPager2 viewPager2) {
        this.f13216b = viewPager2;
        n nVar = viewPager2.f13038A;
        this.f13217c = nVar;
        this.f13218d = (LinearLayoutManager) nVar.getLayoutManager();
        this.g = new e();
        d();
    }

    @Override // E2.r0
    public final void a(RecyclerView recyclerView, int i10) {
        b bVar;
        b bVar2;
        int i11 = this.f13219e;
        if (!(i11 == 1 && this.f13220f == 1) && i10 == 1) {
            this.f13219e = 1;
            int i12 = this.f13222i;
            if (i12 != -1) {
                this.f13221h = i12;
                this.f13222i = -1;
            } else if (this.f13221h == -1) {
                this.f13221h = this.f13218d.P0();
            }
            c(1);
            return;
        }
        if ((i11 == 1 || i11 == 4) && i10 == 2) {
            if (this.f13223k) {
                c(2);
                this.j = true;
                return;
            }
            return;
        }
        e eVar = this.g;
        if ((i11 == 1 || i11 == 4) && i10 == 0) {
            e();
            if (!this.f13223k) {
                int i13 = eVar.f13212a;
                if (i13 != -1 && (bVar2 = this.f13215a) != null) {
                    bVar2.b(i13, 0.0f, 0);
                }
            } else if (eVar.f13214c == 0) {
                int i14 = this.f13221h;
                int i15 = eVar.f13212a;
                if (i14 != i15 && (bVar = this.f13215a) != null) {
                    bVar.c(i15);
                }
            }
            c(0);
            d();
        }
        if (this.f13219e == 2 && i10 == 0 && this.f13224l) {
            e();
            if (eVar.f13214c == 0) {
                int i16 = this.f13222i;
                int i17 = eVar.f13212a;
                if (i16 != i17) {
                    if (i17 == -1) {
                        i17 = 0;
                    }
                    b bVar3 = this.f13215a;
                    if (bVar3 != null) {
                        bVar3.c(i17);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // E2.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        b bVar;
        this.f13223k = true;
        e();
        boolean z10 = this.j;
        e eVar = this.g;
        if (z10) {
            this.j = false;
            if (i11 <= 0) {
                if (i11 == 0) {
                    if ((i10 < 0) == this.f13216b.b()) {
                        if (eVar.f13214c != 0) {
                            i12 = eVar.f13212a + 1;
                        }
                    }
                }
                i12 = eVar.f13212a;
            } else if (eVar.f13214c != 0) {
                i12 = eVar.f13212a + 1;
            } else {
                i12 = eVar.f13212a;
            }
            this.f13222i = i12;
            if (this.f13221h != i12 && (bVar = this.f13215a) != null) {
                bVar.c(i12);
            }
        } else if (this.f13219e == 0) {
            int i13 = eVar.f13212a;
            if (i13 == -1) {
                i13 = 0;
            }
            b bVar2 = this.f13215a;
            if (bVar2 != null) {
                bVar2.c(i13);
            }
        }
        int i14 = eVar.f13212a;
        if (i14 == -1) {
            i14 = 0;
        }
        float f3 = eVar.f13213b;
        int i15 = eVar.f13214c;
        b bVar3 = this.f13215a;
        if (bVar3 != null) {
            bVar3.b(i14, f3, i15);
        }
        int i16 = eVar.f13212a;
        int i17 = this.f13222i;
        if ((i16 == i17 || i17 == -1) && eVar.f13214c == 0 && this.f13220f != 1) {
            c(0);
            d();
        }
    }

    public final void c(int i10) {
        if ((this.f13219e == 3 && this.f13220f == 0) || this.f13220f == i10) {
            return;
        }
        this.f13220f = i10;
        b bVar = this.f13215a;
        if (bVar != null) {
            bVar.a(i10);
        }
    }

    public final void d() {
        this.f13219e = 0;
        this.f13220f = 0;
        e eVar = this.g;
        eVar.f13212a = -1;
        eVar.f13213b = 0.0f;
        eVar.f13214c = 0;
        this.f13221h = -1;
        this.f13222i = -1;
        this.j = false;
        this.f13223k = false;
        this.f13224l = false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0147 A[LOOP:2: B:64:0x013b->B:67:0x0147, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x014a A[SYNTHETIC] */
    public final void e() {
        int top;
        int iW;
        int top2;
        int i10;
        int bottom;
        int i11;
        LinearLayoutManager linearLayoutManager = this.f13218d;
        int iP0 = linearLayoutManager.P0();
        e eVar = this.g;
        eVar.f13212a = iP0;
        if (iP0 == -1) {
            eVar.f13212a = -1;
            eVar.f13213b = 0.0f;
            eVar.f13214c = 0;
            return;
        }
        View viewR = linearLayoutManager.r(iP0);
        if (viewR == null) {
            eVar.f13212a = -1;
            eVar.f13213b = 0.0f;
            eVar.f13214c = 0;
            return;
        }
        int i12 = ((C0137n0) viewR.getLayoutParams()).f1734b.left;
        int i13 = ((C0137n0) viewR.getLayoutParams()).f1734b.right;
        int i14 = ((C0137n0) viewR.getLayoutParams()).f1734b.top;
        int i15 = ((C0137n0) viewR.getLayoutParams()).f1734b.bottom;
        ViewGroup.LayoutParams layoutParams = viewR.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i12 += marginLayoutParams.leftMargin;
            i13 += marginLayoutParams.rightMargin;
            i14 += marginLayoutParams.topMargin;
            i15 += marginLayoutParams.bottomMargin;
        }
        int height = viewR.getHeight() + i14 + i15;
        int width = viewR.getWidth() + i12 + i13;
        int i16 = linearLayoutManager.f12835p;
        n nVar = this.f13217c;
        if (i16 == 0) {
            top = (viewR.getLeft() - i12) - nVar.getPaddingLeft();
            if (this.f13216b.b()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewR.getTop() - i14) - nVar.getPaddingTop();
        }
        int i17 = -top;
        eVar.f13214c = i17;
        if (i17 >= 0) {
            eVar.f13213b = height != 0 ? i17 / height : 0.0f;
            return;
        }
        int iW2 = linearLayoutManager.w();
        if (iW2 != 0) {
            boolean z10 = linearLayoutManager.f12835p == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iW2, 2);
            for (int i18 = 0; i18 < iW2; i18++) {
                View viewV = linearLayoutManager.v(i18);
                if (viewV == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = viewV.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : a.f13205a;
                int[] iArr2 = iArr[i18];
                if (z10) {
                    top2 = viewV.getLeft();
                    i10 = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewV.getTop();
                    i10 = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i10;
                int[] iArr3 = iArr[i18];
                if (z10) {
                    bottom = viewV.getRight();
                    i11 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewV.getBottom();
                    i11 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i11;
            }
            Arrays.sort(iArr, new C0140p(10));
            int i19 = 1;
            while (true) {
                if (i19 >= iW2) {
                    int[] iArr4 = iArr[0];
                    int i20 = iArr4[1];
                    int i21 = iArr4[0];
                    int i22 = i20 - i21;
                    if (i21 <= 0 && iArr[iW2 - 1][1] >= i22) {
                        if (linearLayoutManager.w() <= 1) {
                        }
                    }
                } else if (iArr[i19 - 1][1] == iArr[i19][0]) {
                    i19++;
                }
                iW = linearLayoutManager.w();
                for (int i23 = 0; i23 < iW; i23++) {
                    if (!a.a(linearLayoutManager.v(i23))) {
                        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    }
                }
            }
        } else if (linearLayoutManager.w() <= 1) {
            iW = linearLayoutManager.w();
            while (i23 < iW) {
                if (!a.a(linearLayoutManager.v(i23))) {
                    throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                }
            }
        }
        Locale locale = Locale.US;
        throw new IllegalStateException(c.r(eVar.f13214c, "Page can only be offset by a positive amount, not by "));
    }
}
