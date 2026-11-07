package p181s2;

import E6.u;
import N9.S;
import N9.k0;
import androidx.lifecycle.H;
import androidx.lifecycle.P;
import androidx.lifecycle.z;
import j2.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import p085i0.c;
import p151p.V;
import p251z9.j;

/* JADX INFO: renamed from: s2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1305a extends P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22064b = "SaveableStateHolder_BackStackEntryKey";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f22066d;

    public C1305a(H h7) {
        Object value;
        Object obj;
        h7.getClass();
        u uVar = h7.f12619b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) uVar.f1960b;
        try {
            S s10 = (S) ((LinkedHashMap) uVar.f1963e).get("SaveableStateHolder_BackStackEntryKey");
            if (s10 == null || (value = ((k0) s10).getValue()) == null) {
                value = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) uVar.f1962d).remove("SaveableStateHolder_BackStackEntryKey");
            value = null;
        }
        String string = (String) value;
        if (string == null) {
            string = UUID.randomUUID().toString();
            String str = this.f22064b;
            j.e(str, "key");
            if (string != null) {
                ArrayList arrayList = a.f18750a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    do {
                        if (i10 < size) {
                            obj = arrayList.get(i10);
                            i10++;
                        }
                    } while (!((Class) obj).isInstance(string));
                }
                throw new IllegalArgumentException(("Can't put value with type " + string.getClass() + " into saved state").toString());
            }
            ArrayList arrayList2 = a.f18750a;
            Object obj2 = h7.f12618a.get(str);
            z zVar = obj2 instanceof z ? (z) obj2 : null;
            if (zVar != null) {
                zVar.d(string);
            }
            uVar.y(str, string);
        }
        this.f22065c = string;
    }

    @Override // androidx.lifecycle.P
    public final void b() {
        V v10 = this.f22066d;
        if (v10 == null) {
            j.k("saveableStateHolderRef");
            throw null;
        }
        c cVar = (c) ((WeakReference) v10.f20603r).get();
        if (cVar != null) {
            cVar.f(this.f22065c);
        }
        V v11 = this.f22066d;
        if (v11 != null) {
            ((WeakReference) v11.f20603r).clear();
        } else {
            j.k("saveableStateHolderRef");
            throw null;
        }
    }
}
