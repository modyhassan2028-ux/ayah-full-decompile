package K;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.B1;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 implements M6.b, L6.g, p100j8.c, I1.r, I8.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f4803s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4804t;

    public /* synthetic */ u0(int i10, Object obj, Object obj2) {
        this.f4802r = i10;
        this.f4803s = obj;
        this.f4804t = obj2;
    }

    @Override // L6.g, B6.d
    public Object apply(Object obj) {
        L6.i iVar = (L6.i) this.f4803s;
        E6.j jVar = (E6.j) this.f4804t;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        L6.a aVar = iVar.f5553u;
        ArrayList arrayListN = iVar.n(sQLiteDatabase, jVar, aVar.f5536b);
        for (B6.c cVar : B6.c.values()) {
            if (cVar != jVar.f1939c) {
                int size = aVar.f5536b - arrayListN.size();
                if (size <= 0) {
                    break;
                }
                arrayListN.addAll(iVar.n(sQLiteDatabase, jVar.b(cVar), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < arrayListN.size(); i10++) {
            sb.append(((L6.b) arrayListN.get(i10)).f5540a);
            if (i10 < arrayListN.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new L6.h(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListN.listIterator();
        while (listIterator.hasNext()) {
            L6.b bVar = (L6.b) listIterator.next();
            long j10 = bVar.f5540a;
            if (map.containsKey(Long.valueOf(j10))) {
                E6.h hVarC = bVar.f5542c.c();
                for (L6.h hVar : (Set) map.get(Long.valueOf(j10))) {
                    hVarC.a(hVar.f5547a, hVar.f5548b);
                }
                listIterator.set(new L6.b(j10, bVar.f5541b, hVarC.b()));
            }
        }
        return arrayListN;
    }

    @Override // M6.b
    public Object b() {
        switch (this.f4802r) {
            case 1:
                D6.s sVar = (D6.s) this.f4803s;
                Iterable iterable = (Iterable) this.f4804t;
                L6.i iVar = (L6.i) ((L6.d) sVar.f1310c);
                iVar.getClass();
                if (iterable.iterator().hasNext()) {
                    iVar.b().compileStatement("DELETE FROM events WHERE _id in " + L6.i.A(iterable)).execute();
                    break;
                }
                break;
            default:
                D6.s sVar2 = (D6.s) this.f4803s;
                for (Map.Entry entry : ((HashMap) this.f4804t).entrySet()) {
                    ((L6.i) ((L6.c) sVar2.f1315i)).s(((Integer) entry.getValue()).intValue(), H6.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    @Override // p100j8.c
    public Object c(E6.u uVar) {
        String strValueOf;
        switch (this.f4802r) {
            case 4:
                String str = (String) this.f4803s;
                W2.n nVar = (W2.n) this.f4804t;
                Context context = (Context) uVar.b(Context.class);
                switch (nVar.f9549r) {
                    case 10:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 11:
                        strValueOf = FirebaseCommonRegistrar.a(context);
                        break;
                    case 12:
                        int i10 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "embedded";
                        } else {
                            strValueOf = "";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            strValueOf = "";
                        } else {
                            strValueOf = FirebaseCommonRegistrar.b(installerPackageName);
                        }
                        break;
                }
                return new O8.a(str, strValueOf);
            default:
                String str2 = (String) this.f4803s;
                p100j8.a aVar = (p100j8.a) this.f4804t;
                try {
                    Trace.beginSection(str2);
                    return aVar.f18791f.c(uVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // I8.a
    public void e(I8.b bVar) {
        I8.a aVar = (I8.a) this.f4803s;
        I8.a aVar2 = (I8.a) this.f4804t;
        aVar.e(bVar);
        aVar2.e(bVar);
    }

    @Override // I1.r
    public I1.B0 p(View view, I1.B0 b5) {
        int i10;
        int i11;
        int i12;
        int i13;
        int paddingLeft;
        int paddingTop;
        int paddingRight;
        int paddingBottom;
        p071g9.a aVar = (p071g9.a) this.f4803s;
        p071g9.f fVar = (p071g9.f) this.f4804t;
        aVar.g = new I1.B0(b5);
        p071g9.d dVar = (p071g9.d) aVar.f16339e;
        if (dVar != null) {
            p251z9.j.d(view, "v");
            dVar.a(view, b5, fVar);
            return b5;
        }
        p251z9.j.d(view, "v");
        if (Log.isLoggable("Insetter", 3)) {
            Log.d("Insetter", "applyInsetsToView. View: " + view + ". Insets: " + b5 + ". State: " + fVar);
        }
        H7.M mA = ((H7.M) aVar.f16337c).a(aVar.f16336b);
        p071g9.e eVar = fVar.f16349a;
        int i14 = mA.f3458a;
        if ((mA.f3459b | i14 | mA.f3460c | mA.f3461d) != 0) {
            if (i14 == 0) {
                paddingLeft = view.getPaddingLeft();
            } else {
                paddingLeft = B1.B(b5, i14).f462a + eVar.f16345a;
            }
            int i15 = mA.f3459b;
            if (i15 == 0) {
                paddingTop = view.getPaddingTop();
            } else {
                paddingTop = B1.B(b5, i15).f463b + eVar.f16346b;
            }
            int i16 = mA.f3460c;
            if (i16 == 0) {
                paddingRight = view.getPaddingRight();
            } else {
                paddingRight = B1.B(b5, i16).f464c + eVar.f16347c;
            }
            int i17 = mA.f3461d;
            if (i17 == 0) {
                paddingBottom = view.getPaddingBottom();
            } else {
                paddingBottom = B1.B(b5, i17).f465d + eVar.f16348d;
            }
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        H7.M mA2 = ((H7.M) aVar.f16338d).a(aVar.f16336b);
        p071g9.e eVar2 = fVar.f16350b;
        if ((mA2.f3458a | mA2.f3459b | mA2.f3460c | mA2.f3461d) == 0) {
            return b5;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            throw new IllegalArgumentException("Margin window insets handling requested but View's LayoutParams do not extend MarginLayoutParams");
        }
        int i18 = mA2.f3458a;
        if (i18 == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        } else {
            i10 = B1.B(b5, i18).f462a + eVar2.f16345a;
        }
        int i19 = mA2.f3459b;
        if (i19 == 0) {
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        } else {
            i11 = B1.B(b5, i19).f463b + eVar2.f16346b;
        }
        int i20 = mA2.f3460c;
        if (i20 == 0) {
            i12 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i12 = B1.B(b5, i20).f464c + eVar2.f16347c;
        }
        int i21 = mA2.f3461d;
        if (i21 == 0) {
            i13 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        } else {
            i13 = B1.B(b5, i21).f465d + eVar2.f16348d;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i10 != marginLayoutParams.leftMargin || i11 != marginLayoutParams.topMargin || i12 != marginLayoutParams.rightMargin || i13 != marginLayoutParams.bottomMargin) {
            marginLayoutParams.setMargins(i10, i11, i12, i13);
            view.setLayoutParams(layoutParams);
            if (Build.VERSION.SDK_INT < 26) {
                view.getParent().requestLayout();
            }
        }
        return b5;
    }
}
