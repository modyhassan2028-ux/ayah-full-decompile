package K0;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.EnumC0766o;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p056f2.C0949w;

/* JADX INFO: renamed from: K0.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0368s0 implements M2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5164b;

    public /* synthetic */ C0368s0(int i10, Object obj) {
        this.f5163a = i10;
        this.f5164b = obj;
    }

    @Override // M2.d
    public final Bundle a() {
        p110k9.j[] jVarArr;
        int i10 = this.f5163a;
        Object obj = this.f5164b;
        switch (i10) {
            case 0:
                Map mapC = ((p085i0.k) obj).c();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapC.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 1:
                int i11 = ComponentActivity.f11367K;
                Bundle bundle2 = new Bundle();
                p020c.i iVar = ((ComponentActivity) obj).f11385z;
                iVar.getClass();
                LinkedHashMap linkedHashMap = iVar.f13383b;
                bundle2.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle2.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(iVar.f13385d));
                bundle2.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(iVar.g));
                return bundle2;
            case 2:
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                int i12 = FragmentActivity.Q;
                while (FragmentActivity.n(((C0949w) fragmentActivity.f12591L.f9953r).f16175u)) {
                }
                fragmentActivity.f12592M.d(EnumC0766o.ON_STOP);
                return new Bundle();
            case 3:
                return ((p056f2.K) obj).X();
            default:
                E6.u uVar = (E6.u) obj;
                for (Map.Entry entry2 : p120l9.w.k0((LinkedHashMap) uVar.f1963e).entrySet()) {
                    uVar.y((String) entry2.getKey(), ((N9.k0) ((N9.S) entry2.getValue())).getValue());
                }
                for (Map.Entry entry3 : p120l9.w.k0((LinkedHashMap) uVar.f1961c).entrySet()) {
                    uVar.y((String) entry3.getKey(), ((M2.d) entry3.getValue()).a());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) uVar.f1960b;
                if (linkedHashMap2.isEmpty()) {
                    jVarArr = new p110k9.j[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new p110k9.j((String) entry4.getKey(), entry4.getValue()));
                    }
                    jVarArr = (p110k9.j[]) arrayList.toArray(new p110k9.j[0]);
                }
                return AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(jVarArr, jVarArr.length));
        }
    }
}
