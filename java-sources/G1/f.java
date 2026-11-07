package G1;

import Da.r;
import H7.H;
import H7.L;
import H7.M;
import I1.B0;
import I1.y0;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.internal.measurement.O1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.realm.RealmFieldTypeConstants;
import p009aa.p;
import p084i.E;
import p140o.v;
import p151p.C1240f;
import p151p.C1250k;
import p178r8.j;
import p178r8.k;

/* JADX INFO: loaded from: classes.dex */
public class f implements v, k, L {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2780r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f2781s;

    public f(Uri uri, boolean z10, boolean z11) {
        this.f2781s = uri;
        this.f2780r = z10;
    }

    @Override // p178r8.k
    public void a(j jVar, int i10) {
        StringBuilder sb = (StringBuilder) this.f2781s;
        if (this.f2780r) {
            this.f2780r = false;
        } else {
            sb.append(", ");
        }
        sb.append(i10);
    }

    @Override // p140o.v
    public void b(p140o.k kVar, boolean z10) {
        C1250k c1250k;
        E e10 = (E) this.f2781s;
        if (this.f2780r) {
            return;
        }
        this.f2780r = true;
        ActionMenuView actionMenuView = e10.f16506e.f20674a.f11705r;
        if (actionMenuView != null && (c1250k = actionMenuView.f11479K) != null) {
            c1250k.d();
            C1240f c1240f = c1250k.f20702L;
            if (c1240f != null && c1240f.b()) {
                c1240f.f20204i.dismiss();
            }
        }
        e10.f16507f.onPanelClosed(108, kVar);
        this.f2780r = false;
    }

    public boolean c() {
        return this.f2780r;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    public boolean d(CharSequence charSequence, int i10) {
        if (charSequence == null || i10 < 0 || charSequence.length() - i10 < 0) {
            throw new IllegalArgumentException();
        }
        e eVar = (e) this.f2781s;
        if (eVar == null) {
            return c();
        }
        eVar.getClass();
        char c10 = 0;
        c10 = 2;
        for (int i11 = 0; i11 < i10 && c10 == 2; i11++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i11));
            f fVar = g.f2782a;
            if (directionality == 0) {
                c10 = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        c10 = 1;
                        continue;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                    case 17:
                        break;
                    default:
                        c10 = 2;
                        continue;
                }
            }
        }
        if (c10 == 0) {
            return true;
        }
        if (c10 != 1) {
            return c();
        }
        return false;
    }

    public void e() {
        this.f2780r = false;
    }

    public void f(byte b5) {
        ((r) this.f2781s).r(String.valueOf(b5));
    }

    public void g(char c10) {
        r rVar = (r) this.f2781s;
        rVar.h(rVar.f1387s, 1);
        char[] cArr = (char[]) rVar.f1388t;
        int i10 = rVar.f1387s;
        rVar.f1387s = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // p140o.v
    public boolean h(p140o.k kVar) {
        ((E) this.f2781s).f16507f.onMenuOpened(108, kVar);
        return true;
    }

    public void i(int i10) {
        ((r) this.f2781s).r(String.valueOf(i10));
    }

    public void j(long j) {
        ((r) this.f2781s).r(String.valueOf(j));
    }

    public void k(String str) {
        p251z9.j.e(str, "v");
        ((r) this.f2781s).r(str);
    }

    public void l(short s10) {
        ((r) this.f2781s).r(String.valueOf(s10));
    }

    public void m(String str) {
        byte b5;
        p251z9.j.e(str, "value");
        r rVar = (r) this.f2781s;
        rVar.h(rVar.f1387s, str.length() + 2);
        char[] cArr = (char[]) rVar.f1388t;
        int i10 = rVar.f1387s;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c10 = cArr[i13];
            byte[] bArr = p.f11270b;
            if (c10 < bArr.length && bArr[c10] != 0) {
                int length2 = str.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    rVar.h(i13, 2);
                    char cCharAt = str.charAt(i14);
                    byte[] bArr2 = p.f11270b;
                    if (cCharAt >= bArr2.length || (b5 = bArr2[cCharAt]) == 0) {
                        int i15 = i13 + 1;
                        ((char[]) rVar.f1388t)[i13] = cCharAt;
                        i13 = i15;
                    } else if (b5 == 1) {
                        String str2 = p.f11269a[cCharAt];
                        p251z9.j.b(str2);
                        rVar.h(i13, str2.length());
                        str2.getChars(0, str2.length(), (char[]) rVar.f1388t, i13);
                        int length3 = str2.length() + i13;
                        rVar.f1387s = length3;
                        i13 = length3;
                    } else {
                        char[] cArr2 = (char[]) rVar.f1388t;
                        cArr2[i13] = '\\';
                        cArr2[i13 + 1] = (char) b5;
                        i13 += 2;
                        rVar.f1387s = i13;
                    }
                }
                rVar.h(i13, 1);
                ((char[]) rVar.f1388t)[i13] = '\"';
                rVar.f1387s = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        rVar.f1387s = i12 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    @Override // H7.L
    public B0 n(View view, B0 b5, M m10) {
        boolean z10;
        y0 y0Var = b5.f3671a;
        A1.c cVarG = y0Var.g(519);
        A1.c cVarG2 = y0Var.g(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2781s;
        int i10 = cVarG.f463b;
        int i11 = cVarG.f464c;
        int i12 = cVarG.f462a;
        bottomSheetBehavior.f14664N = i10;
        boolean zL = H.l(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z11 = bottomSheetBehavior.f14656F;
        if (z11) {
            int iA = b5.a();
            bottomSheetBehavior.f14663M = iA;
            paddingBottom = iA + m10.f3461d;
        }
        if (bottomSheetBehavior.f14657G) {
            paddingLeft = (zL ? m10.f3460c : m10.f3458a) + i12;
        }
        if (bottomSheetBehavior.f14658H) {
            paddingRight = (zL ? m10.f3458a : m10.f3460c) + i11;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z12 = true;
        if (!bottomSheetBehavior.f14660J || marginLayoutParams.leftMargin == i12) {
            z10 = false;
        } else {
            marginLayoutParams.leftMargin = i12;
            z10 = true;
        }
        if (bottomSheetBehavior.f14661K && marginLayoutParams.rightMargin != i11) {
            marginLayoutParams.rightMargin = i11;
            z10 = true;
        }
        if (bottomSheetBehavior.f14662L) {
            int i13 = marginLayoutParams.topMargin;
            int i14 = cVarG.f463b;
            if (i13 != i14) {
                marginLayoutParams.topMargin = i14;
            } else {
                z12 = z10;
            }
        } else {
            z12 = z10;
        }
        if (z12) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z13 = this.f2780r;
        if (z13) {
            bottomSheetBehavior.f14654D = cVarG2.f465d;
        }
        if (!z11 && !z13) {
            return b5;
        }
        bottomSheetBehavior.T();
        return b5;
    }

    public O1 q(long j, String str) {
        Long lValueOf = Long.valueOf(j);
        Object obj = O1.g;
        return new O1(this, str, lValueOf, 0);
    }

    public O1 r(String str, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        Object obj = O1.g;
        return new O1(this, str, boolValueOf, 1);
    }

    public O1 s(String str, String str2) {
        Object obj = O1.g;
        return new O1(this, str, str2, 3);
    }

    public /* synthetic */ f(Object obj) {
        this.f2781s = obj;
    }

    public /* synthetic */ f(Object obj, boolean z10) {
        this.f2781s = obj;
        this.f2780r = true;
    }

    public f(e eVar, boolean z10) {
        this(eVar);
        this.f2780r = z10;
    }

    public f(BottomSheetBehavior bottomSheetBehavior, boolean z10) {
        this.f2781s = bottomSheetBehavior;
        this.f2780r = z10;
    }

    public void o() {
    }

    public void p() {
    }
}
