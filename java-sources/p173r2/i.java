package p173r2;

import G9.k;
import G9.m;
import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.U;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p013b2.n;
import p018b9.d;
import p105k2.a;
import p241y9.c;
import p251z9.e;
import p251z9.j;
import p251z9.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static String a(n nVar, int i10) {
        j.e(nVar, "context");
        if (i10 <= 16777215) {
            return String.valueOf(i10);
        }
        try {
            Context context = nVar.f13172a;
            j.b(context);
            String resourceName = context.getResources().getResourceName(i10);
            j.b(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i10);
        }
    }

    public static G9.i b(v vVar) {
        j.e(vVar, "<this>");
        return k.b0(vVar, new m(23));
    }

    public static o c(U u8) {
        d dVar = p.f21463a;
        a aVar = a.f18957b;
        j.e(dVar, "factory");
        j.e(aVar, "extras");
        Aa.a aVar2 = new Aa.a(u8, dVar, aVar);
        e eVarA = w.a(o.class);
        String strB = eVarA.b();
        if (strB != null) {
            return (o) aVar2.x("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB), eVarA);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static String d(Class cls) {
        LinkedHashMap linkedHashMap = H.f21433b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            F f3 = (F) cls.getAnnotation(F.class);
            strValue = f3 != null ? f3.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, strValue);
        }
        j.b(strValue);
        return strValue;
    }

    public static final ArrayList e(Map map, c cVar) {
        j.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C1288h c1288h = (C1288h) entry.getValue();
            Boolean bool = c1288h != null ? Boolean.FALSE : null;
            j.b(bool);
            if (!bool.booleanValue() && !c1288h.f21440b) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) cVar.e((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
