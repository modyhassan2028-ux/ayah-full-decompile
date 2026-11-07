package p020c;

import L5.c;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p041e.a;
import p056f2.C0949w;
import p251z9.j;
import p251z9.y;

/* JADX INFO: renamed from: c.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0780e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f13374b;

    public /* synthetic */ C0780e(ComponentActivity componentActivity, int i10) {
        this.f13373a = i10;
        this.f13374b = componentActivity;
    }

    @Override // p041e.a
    public final void a(ComponentActivity componentActivity) {
        int i10 = this.f13373a;
        ComponentActivity componentActivity2 = this.f13374b;
        switch (i10) {
            case 0:
                int i11 = ComponentActivity.f11367K;
                j.e(componentActivity, "it");
                Bundle bundleM = ((c) componentActivity2.f11380u.f5533t).m("android:support:activity-result");
                if (bundleM != null) {
                    i iVar = componentActivity2.f11385z;
                    LinkedHashMap linkedHashMap = iVar.f13383b;
                    LinkedHashMap linkedHashMap2 = iVar.f13382a;
                    Bundle bundle = iVar.g;
                    ArrayList<Integer> integerArrayList = bundleM.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleM.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleM.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            iVar.f13385d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleM.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            String str = stringArrayList.get(i12);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    y.a(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i12);
                            j.d(num2, "rcs[i]");
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i12);
                            j.d(str2, "keys[i]");
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            iVar.f13383b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                C0949w c0949w = (C0949w) ((FragmentActivity) componentActivity2).f12591L.f9953r;
                c0949w.f16175u.b(c0949w, c0949w, null);
                break;
        }
    }
}
