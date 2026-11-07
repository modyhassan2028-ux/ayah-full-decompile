package Da;

import E2.C0124h;
import H7.C0227a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.realm.RealmFieldTypeConstants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p084i.C0953a;
import p084i.C0954b;
import p084i.C0955c;
import p084i.C0956d;
import p084i.C0957e;
import p084i.C0958f;
import p084i.DialogInterfaceC0959g;
import p223x.AbstractC1434x;
import p223x.G;
import u.AbstractC1356k;

/* JADX INFO: loaded from: classes.dex */
public final class r implements J1.q {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1386r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1387s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f1388t;

    public /* synthetic */ r(char c10, int i10) {
        this.f1386r = i10;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(r rVar, p110k9.b bVar, q9.a aVar) {
        p009aa.l lVar;
        byte bH;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        r rVar2;
        byte bG;
        C0124h c0124h;
        C0124h c0124h2 = (C0124h) rVar.f1388t;
        if (aVar instanceof p009aa.l) {
            lVar = (p009aa.l) aVar;
            int i10 = lVar.f11254x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f11254x = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new p009aa.l(rVar, aVar);
            }
        } else {
            lVar = new p009aa.l(rVar, aVar);
        }
        Object obj = lVar.f11252v;
        int i11 = lVar.f11254x;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = lVar.f11251u;
            linkedHashMap2 = lVar.f11250t;
            rVar2 = lVar.f11249s;
            p110k9.b bVar2 = lVar.f11248r;
            p110k9.a.e(obj);
            linkedHashMap2.put(str, (Z9.i) obj);
            bG = ((C0124h) rVar2.f1388t).g();
            if (bG == 4) {
                bH = bG;
                rVar = rVar2;
                linkedHashMap = linkedHashMap2;
                bVar = bVar2;
            } else if (bG != 7) {
                C0124h.p((C0124h) rVar2.f1388t, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            c0124h = (C0124h) rVar2.f1388t;
            if (bG == 6) {
                c0124h.h((byte) 7);
            } else if (bG == 4) {
                p009aa.i.f(c0124h, "object");
                throw null;
            }
            return new Z9.s(linkedHashMap2);
        }
        p110k9.a.e(obj);
        bH = c0124h2.h((byte) 6);
        if (c0124h2.D() == 4) {
            C0124h.p(c0124h2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        C0124h c0124h3 = (C0124h) rVar.f1388t;
        if (c0124h3.d()) {
            String strK = c0124h3.k();
            c0124h3.h((byte) 5);
            lVar.f11248r = bVar;
            lVar.f11249s = rVar;
            lVar.f11250t = linkedHashMap;
            lVar.f11251u = strK;
            lVar.f11254x = 1;
            bVar.getClass();
            bVar.f19068s = lVar;
            return p161p9.a.f21156r;
        }
        linkedHashMap2 = linkedHashMap;
        rVar2 = rVar;
        bG = bH;
        c0124h = (C0124h) rVar2.f1388t;
        if (bG == 6) {
            c0124h.h((byte) 7);
        } else if (bG == 4) {
            p009aa.i.f(c0124h, "object");
            throw null;
        }
        return new Z9.s(linkedHashMap2);
    }

    public static void g(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = p251z9.j.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        if (str.subSequence(i10, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e10) {
            Log.w("SupportSQLite", "delete failed: ", e10);
        }
    }

    public void b(long j) {
        if (d(j)) {
            return;
        }
        int i10 = this.f1387s;
        long[] jArrCopyOf = (long[]) this.f1388t;
        if (i10 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i10 + 1, jArrCopyOf.length * 2));
            p251z9.j.d(jArrCopyOf, "copyOf(...)");
            this.f1388t = jArrCopyOf;
        }
        jArrCopyOf[i10] = j;
        if (i10 >= this.f1387s) {
            this.f1387s = i10 + 1;
        }
    }

    public G c(Float f3, int i10) {
        G g = new G(f3, AbstractC1434x.f24124d);
        ((u.t) this.f1388t).h(i10, g);
        return g;
    }

    public boolean d(long j) {
        int i10 = this.f1387s;
        for (int i11 = 0; i11 < i10; i11++) {
            if (((long[]) this.f1388t)[i11] == j) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.widget.ListAdapter] */
    public DialogInterfaceC0959g e() {
        ?? c0957e;
        C0956d c0956d = (C0956d) this.f1388t;
        ContextThemeWrapper contextThemeWrapper = c0956d.f16557a;
        ContextThemeWrapper contextThemeWrapper2 = c0956d.f16557a;
        DialogInterfaceC0959g dialogInterfaceC0959g = new DialogInterfaceC0959g(contextThemeWrapper, this.f1387s);
        View view = c0956d.f16561e;
        C0958f c0958f = dialogInterfaceC0959g.f16607w;
        if (view != null) {
            c0958f.f16603w = view;
        } else {
            CharSequence charSequence = c0956d.f16560d;
            if (charSequence != null) {
                c0958f.f16586d = charSequence;
                TextView textView = c0958f.f16601u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0956d.f16559c;
            if (drawable != null) {
                c0958f.f16599s = drawable;
                ImageView imageView = c0958f.f16600t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0958f.f16600t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c0956d.f16562f;
        if (charSequence2 != null) {
            c0958f.f16587e = charSequence2;
            TextView textView2 = c0958f.f16602v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c0956d.g;
        if (charSequence3 != null) {
            c0958f.c(-1, charSequence3, c0956d.f16563h);
        }
        CharSequence charSequence4 = c0956d.f16564i;
        if (charSequence4 != null) {
            c0958f.c(-2, charSequence4, c0956d.j);
        }
        if (c0956d.f16567m != null || c0956d.f16568n != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0956d.f16558b.inflate(c0958f.f16576A, (ViewGroup) null);
            if (c0956d.f16572r) {
                c0957e = new C0953a(c0956d, contextThemeWrapper2, c0958f.f16577B, c0956d.f16567m, alertController$RecycleListView);
            } else {
                int i10 = c0956d.f16573s ? c0958f.f16578C : c0958f.f16579D;
                Object obj = c0956d.f16568n;
                c0957e = obj;
                if (obj == null) {
                    c0957e = new C0957e(contextThemeWrapper2, i10, R.id.text1, c0956d.f16567m);
                }
            }
            c0958f.f16604x = c0957e;
            c0958f.f16605y = c0956d.f16574t;
            if (c0956d.f16569o != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0954b(c0956d, c0958f));
            } else if (c0956d.f16575u != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0955c(c0956d, alertController$RecycleListView, c0958f));
            }
            if (c0956d.f16573s) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (c0956d.f16572r) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            c0958f.f16588f = alertController$RecycleListView;
        }
        View view2 = c0956d.f16570p;
        if (view2 != null) {
            c0958f.g = view2;
            c0958f.f16589h = false;
        }
        dialogInterfaceC0959g.setCancelable(c0956d.f16565k);
        if (c0956d.f16565k) {
            dialogInterfaceC0959g.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC0959g.setOnCancelListener(null);
        dialogInterfaceC0959g.setOnDismissListener(null);
        p140o.l lVar = c0956d.f16566l;
        if (lVar != null) {
            dialogInterfaceC0959g.setOnKeyListener(lVar);
        }
        return dialogInterfaceC0959g;
    }

    @Override // J1.q
    public boolean f(View view) {
        ((BottomSheetBehavior) this.f1388t).L(this.f1387s);
        return true;
    }

    public void h(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = (char[]) this.f1388t;
        if (cArr.length <= i12) {
            int i13 = i10 * 2;
            if (i12 < i13) {
                i12 = i13;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i12);
            p251z9.j.d(cArrCopyOf, "copyOf(...)");
            this.f1388t = cArrCopyOf;
        }
    }

    public void i(int i10, e eVar) {
        while (true) {
            int i11 = i10 >> 1;
            if (i11 == 0) {
                break;
            }
            e eVar2 = ((e[]) this.f1388t)[i11];
            p251z9.j.b(eVar2);
            if (p251z9.j.g(0L, eVar.f1344c - eVar2.f1344c) <= 0) {
                break;
            }
            eVar2.f1359f = i10;
            ((e[]) this.f1388t)[i10] = eVar2;
            i10 = i11;
        }
        ((e[]) this.f1388t)[i10] = eVar;
        eVar.f1359f = i10;
    }

    public void j(S2.b bVar, int i10, int i11) {
        ((F2.p) this.f1388t).e(new I2.a(bVar), i10, i11);
    }

    public Z9.i k() {
        Z9.i sVar;
        Object obj;
        C0124h c0124h = (C0124h) this.f1388t;
        byte bD = c0124h.D();
        if (bD == 1) {
            return m(true);
        }
        if (bD == 0) {
            return m(false);
        }
        if (bD != 6) {
            if (bD == 8) {
                return l();
            }
            C0124h.p(c0124h, "Cannot read Json element because of unexpected ".concat(p009aa.i.k(bD)), 0, null, 6);
            throw null;
        }
        int i10 = this.f1387s + 1;
        this.f1387s = i10;
        if (i10 == 200) {
            p009aa.k kVar = new p009aa.k(this, null);
            p110k9.b bVar = new p110k9.b();
            bVar.f19067r = kVar;
            bVar.f19068s = bVar;
            p161p9.a aVar = p110k9.a.f19066a;
            bVar.f19069t = aVar;
            while (true) {
                obj = bVar.f19069t;
                p150o9.c cVar = bVar.f19068s;
                if (cVar == null) {
                    break;
                }
                if (p251z9.j.a(aVar, obj)) {
                    try {
                        p009aa.k kVar2 = bVar.f19067r;
                        p251z9.y.b(3, kVar2);
                        p009aa.k kVar3 = new p009aa.k(kVar2.f11247u, cVar);
                        kVar3.f11246t = bVar;
                        Object objInvokeSuspend = kVar3.invokeSuspend(p110k9.y.f19095a);
                        if (objInvokeSuspend != p161p9.a.f21156r) {
                            cVar.resumeWith(objInvokeSuspend);
                        }
                    } catch (Throwable th) {
                        cVar.resumeWith(p110k9.a.b(th));
                    }
                } else {
                    bVar.f19069t = aVar;
                    cVar.resumeWith(obj);
                }
            }
            p110k9.a.e(obj);
            sVar = (Z9.i) obj;
        } else {
            byte bH = c0124h.h((byte) 6);
            if (c0124h.D() == 4) {
                C0124h.p(c0124h, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (c0124h.d()) {
                String strK = c0124h.k();
                c0124h.h((byte) 5);
                linkedHashMap.put(strK, k());
                bH = c0124h.g();
                if (bH != 4) {
                    if (bH == 7) {
                        break;
                    }
                    C0124h.p(c0124h, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bH == 6) {
                c0124h.h((byte) 7);
            } else if (bH == 4) {
                p009aa.i.f(c0124h, "object");
                throw null;
            }
            sVar = new Z9.s(linkedHashMap);
        }
        this.f1387s--;
        return sVar;
    }

    public Z9.d l() {
        C0124h c0124h = (C0124h) this.f1388t;
        byte bG = c0124h.g();
        if (c0124h.D() == 4) {
            C0124h.p(c0124h, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (c0124h.d()) {
            arrayList.add(k());
            bG = c0124h.g();
            if (bG != 4) {
                boolean z10 = bG == 9;
                int i10 = c0124h.f1673b;
                if (!z10) {
                    C0124h.p(c0124h, "Expected end of the array or comma", i10, null, 4);
                    throw null;
                }
            }
        }
        if (bG == 8) {
            c0124h.h((byte) 9);
        } else if (bG == 4) {
            p009aa.i.f(c0124h, "array");
            throw null;
        }
        return new Z9.d(arrayList);
    }

    public Z9.w m(boolean z10) {
        C0124h c0124h = (C0124h) this.f1388t;
        String strL = !z10 ? c0124h.l() : c0124h.k();
        return (z10 || !p251z9.j.a(strL, "null")) ? new Z9.m(strL, z10) : Z9.p.INSTANCE;
    }

    public void n() {
        p009aa.b bVar = p009aa.b.f11234t;
        char[] cArr = (char[]) this.f1388t;
        bVar.getClass();
        p251z9.j.e(cArr, "array");
        synchronized (bVar) {
            int i10 = bVar.f3712r;
            if (cArr.length + i10 < p009aa.a.f11233a) {
                bVar.f3712r = i10 + cArr.length;
                ((p120l9.k) bVar.f3713s).addLast(cArr);
            }
        }
    }

    public void o(long j) {
        int i10 = this.f1387s;
        int i11 = 0;
        while (i11 < i10) {
            if (j == ((long[]) this.f1388t)[i11]) {
                int i12 = this.f1387s - 1;
                while (i11 < i12) {
                    long[] jArr = (long[]) this.f1388t;
                    int i13 = i11 + 1;
                    jArr[i11] = jArr[i13];
                    i11 = i13;
                }
                this.f1387s--;
                return;
            }
            i11++;
        }
    }

    public void p(e eVar) {
        e eVar2;
        int i10 = eVar.f1359f;
        if (i10 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i11 = this.f1387s;
        e eVar3 = ((e[]) this.f1388t)[i11];
        p251z9.j.b(eVar3);
        eVar.f1359f = -1;
        ((e[]) this.f1388t)[i11] = null;
        this.f1387s = i11 - 1;
        if (eVar == eVar3) {
            return;
        }
        int iG = p251z9.j.g(0L, eVar3.f1344c - eVar.f1344c);
        if (iG == 0) {
            ((e[]) this.f1388t)[i10] = eVar3;
            eVar3.f1359f = i10;
            return;
        }
        if (iG >= 0) {
            i(i10, eVar3);
            return;
        }
        while (true) {
            int i12 = i10 << 1;
            int i13 = i12 + 1;
            int i14 = this.f1387s;
            if (i13 > i14) {
                if (i12 > i14) {
                    break;
                }
                eVar2 = ((e[]) this.f1388t)[i12];
                p251z9.j.b(eVar2);
            } else {
                eVar2 = ((e[]) this.f1388t)[i12];
                p251z9.j.b(eVar2);
                e eVar4 = ((e[]) this.f1388t)[i13];
                p251z9.j.b(eVar4);
                if (p251z9.j.g(0L, eVar4.f1344c - eVar2.f1344c) >= 0) {
                    eVar2 = eVar4;
                }
            }
            if (p251z9.j.g(0L, eVar2.f1344c - eVar3.f1344c) <= 0) {
                break;
            }
            int i15 = eVar2.f1359f;
            eVar2.f1359f = i10;
            ((e[]) this.f1388t)[i10] = eVar2;
            i10 = i15;
        }
        ((e[]) this.f1388t)[i10] = eVar3;
        eVar3.f1359f = i10;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    public int q(int i10) {
        float f3 = -1;
        SparseArray sparseArray = (SparseArray) this.f1388t;
        int i11 = 0;
        if (-1 == i10) {
            s1.q qVar = i10 == -1 ? (s1.q) sparseArray.valueAt(0) : (s1.q) sparseArray.get(-1);
            if (qVar != null) {
                ArrayList arrayList = qVar.f22057b;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        i11 = -1;
                        break;
                    }
                    if (((s1.r) arrayList.get(i11)).a(f3, f3)) {
                        break;
                    }
                    i11++;
                }
                if (-1 != i11) {
                    return i11 == -1 ? qVar.f22058c : ((s1.r) arrayList.get(i11)).f22063e;
                }
            }
        } else {
            s1.q qVar2 = (s1.q) sparseArray.get(i10);
            if (qVar2 != null) {
                ArrayList arrayList2 = qVar2.f22057b;
                while (i11 < arrayList2.size()) {
                    if (((s1.r) arrayList2.get(i11)).a(f3, f3)) {
                        return i11 == -1 ? qVar2.f22058c : ((s1.r) arrayList2.get(i11)).f22063e;
                    }
                    i11++;
                }
                i11 = -1;
                if (i11 == -1) {
                }
            }
        }
        return -1;
    }

    public void r(String str) {
        p251z9.j.e(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        h(this.f1387s, length);
        str.getChars(0, str.length(), (char[]) this.f1388t, this.f1387s);
        this.f1387s += length;
    }

    public String toString() {
        switch (this.f1386r) {
            case 5:
                return new String((char[]) this.f1388t, 0, this.f1387s);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ r(int i10, int i11, Object obj) {
        this.f1386r = i11;
        this.f1388t = obj;
        this.f1387s = i10;
    }

    public r(R6.b bVar, int i10) {
        this.f1386r = 4;
        U6.y.f(bVar);
        this.f1388t = bVar;
        this.f1387s = i10;
    }

    public r(C0227a c0227a, C0124h c0124h) {
        this.f1386r = 6;
        p251z9.j.e(c0227a, "configuration");
        this.f1388t = c0124h;
    }

    public r(int i10, String str) {
        this.f1386r = 12;
        this.f1387s = i10;
        this.f1388t = str;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a6 A[Catch: IOException -> 0x0058, XmlPullParserException -> 0x005b, TryCatch #2 {IOException -> 0x0058, XmlPullParserException -> 0x005b, blocks: (B:8:0x0038, B:18:0x004c, B:44:0x00c0, B:25:0x005e, B:26:0x0066, B:42:0x00a6, B:28:0x006a, B:30:0x0072, B:32:0x0079, B:33:0x007f, B:36:0x0086, B:39:0x008f, B:41:0x0097, B:43:0x00bd), top: B:49:0x0038 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00a6, please report this as an issue */
    public r(Context context, XmlResourceParser xmlResourceParser) {
        this.f1386r = 10;
        this.f1387s = -1;
        this.f1388t = new SparseArray();
        new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s1.p.f22052r);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f1387s = typedArrayObtainStyledAttributes.getResourceId(index, this.f1387s);
            }
        }
        try {
            int eventType = xmlResourceParser.getEventType();
            s1.q qVar = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType != 2) {
                    if (eventType == 3 && "StateSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                qVar = new s1.q(context, xmlResourceParser);
                                ((SparseArray) this.f1388t).put(qVar.f22056a, qVar);
                            } else {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            }
                            break;
                        case 1301459538:
                            if (!name.equals("LayoutDescription")) {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                s1.r rVar = new s1.r(context, xmlResourceParser);
                                if (qVar != null) {
                                    qVar.f22057b.add(rVar);
                                }
                            } else {
                                Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            }
                            break;
                        default:
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            break;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public r(F2.p pVar, int i10) {
        this.f1386r = 3;
        this.f1388t = pVar;
        this.f1386r = 3;
        this.f1387s = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(Context context) {
        this(context, DialogInterfaceC0959g.g(context, 0));
        this.f1386r = 8;
    }

    public r(Context context, int i10) {
        this.f1386r = 8;
        this.f1388t = new C0956d(new ContextThemeWrapper(context, DialogInterfaceC0959g.g(context, i10)));
        this.f1387s = i10;
    }

    public r(int i10, byte b5) {
        this.f1386r = i10;
        switch (i10) {
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                this.f1387s = 300;
                u.t tVar = AbstractC1356k.f22736a;
                this.f1388t = new u.t();
                break;
            default:
                this.f1387s = 1;
                this.f1388t = Collections.singletonList(null);
                break;
        }
    }

    public r(ArrayList arrayList) {
        this.f1386r = 2;
        this.f1387s = 0;
        this.f1388t = arrayList;
    }
}
