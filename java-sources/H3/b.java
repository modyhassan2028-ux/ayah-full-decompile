package H3;

import A.k1;
import T1.InterfaceC0488e;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p120l9.l;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0488e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3342a;

    public b(SharedPreferences sharedPreferences) {
        this.f3342a = sharedPreferences;
    }

    public static void d(X1.b bVar, X1.e eVar, Object obj) {
        j.e(eVar, "key");
        if (bVar.f9843a.containsKey(eVar)) {
            return;
        }
        bVar.f(eVar, obj);
    }

    @Override // T1.InterfaceC0488e
    public final void a() {
        this.f3342a.edit().remove("arabic").remove("nightMode").remove("themeMode").remove("themeDarkerNightMode").remove("sectionHighlighting").remove("defaultReciterId").remove("lastTafseer").remove("lastPageNumber").remove("lastJumpPage").remove("lastSearchQuery").apply();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    @Override // T1.InterfaceC0488e
    public final Object b(Object obj, k1 k1Var) {
        X1.b bVar = (X1.b) obj;
        SharedPreferences sharedPreferences = this.f3342a;
        String str = "default";
        if (sharedPreferences.contains("themeMode")) {
            String string = sharedPreferences.getString("themeMode", null);
            if (string != null) {
                str = string;
            }
        } else if (sharedPreferences.contains("nightMode")) {
            str = sharedPreferences.getBoolean("nightMode", false) ? "dark" : "light";
        }
        boolean z10 = sharedPreferences.getBoolean("arabic", Build.VERSION.SDK_INT < 24 ? j.a(Resources.getSystem().getConfiguration().locale.getLanguage(), "ar") : j.a(Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage(), "ar"));
        boolean z11 = sharedPreferences.getBoolean("themeDarkerNightMode", false);
        boolean z12 = sharedPreferences.getBoolean("sectionHighlighting", false);
        String string2 = sharedPreferences.getString("defaultReciterId", null);
        if (string2 == null) {
            string2 = "husary";
        }
        String string3 = sharedPreferences.getString("lastTafseer", null);
        if (string3 == null) {
            string3 = "ar-mokhtasar";
        }
        int i10 = sharedPreferences.getInt("lastPageNumber", 1);
        int i11 = sharedPreferences.getInt("lastJumpPage", -1);
        String string4 = sharedPreferences.getString("lastSearchQuery", null);
        String str2 = (String) f.f3355c.get(string3);
        if (str2 == null) {
            str2 = string3;
        }
        String str3 = "ru_mokhtasar".equals(str2) ? "ar-mokhtasar" : string3;
        String strValueOf = i11 > 0 ? String.valueOf(i11) : "";
        X1.b bVarG = bVar.g();
        d(bVarG, F3.a.f2348e, str);
        d(bVarG, F3.a.f2349f, str3);
        d(bVarG, F3.a.g, string2);
        d(bVarG, F3.a.f2347d, Boolean.valueOf(z10));
        d(bVarG, F3.a.f2351i, Boolean.valueOf(z11));
        d(bVarG, F3.a.f2350h, Boolean.valueOf(z12));
        d(bVarG, F3.a.j, new Integer(i10));
        d(bVarG, F3.a.f2352k, strValueOf);
        X1.e eVar = F3.a.f2353l;
        if (string4 == null) {
            string4 = "";
        }
        d(bVarG, eVar, string4);
        return bVarG.h();
    }

    @Override // T1.InterfaceC0488e
    public final Object c(Object obj, p150o9.c cVar) {
        Map mapA = ((X1.b) obj).a();
        boolean z10 = false;
        List listS = l.S(new X1.e[]{F3.a.f2348e, F3.a.f2347d, F3.a.f2351i, F3.a.f2350h, F3.a.g, F3.a.f2349f, F3.a.j, F3.a.f2352k});
        if (!listS.isEmpty()) {
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                if (!mapA.containsKey((X1.e) it.next())) {
                    z10 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z10);
    }
}
