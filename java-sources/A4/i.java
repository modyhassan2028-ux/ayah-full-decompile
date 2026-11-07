package A4;

import Z.F;
import android.content.Context;
import android.os.Bundle;
import com.ayah.feature.audioconfig.AudioConfigWrapper;
import com.ayah.feature.today.ui.wrapper.TodayPage;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p173r2.A;
import p181s2.t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f526s;

    public /* synthetic */ i(Context context, int i10) {
        this.f525r = i10;
        this.f526s = context;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        Boolean bool;
        int i10 = this.f525r;
        Context context = this.f526s;
        switch (i10) {
            case 0:
                int i11 = AudioConfigWrapper.f13759u;
                p251z9.j.e((F) obj, "$this$DisposableEffect");
                return new m(context, 0);
            case 1:
                String string = context.getString(((Integer) obj).intValue());
                p251z9.j.d(string, "getString(...)");
                return string;
            case 2:
                int i12 = TodayPage.f13902v;
                p251z9.j.e((F) obj, "$this$DisposableEffect");
                return new m(context, 1);
            case 3:
                String string2 = context.getString(((Integer) obj).intValue());
                p251z9.j.d(string2, "getString(...)");
                return string2;
            default:
                Bundle bundle = (Bundle) obj;
                A aB = t.b(context);
                if (bundle != null) {
                    bundle.setClassLoader(aB.f21411a.getClassLoader());
                }
                p197u2.h hVar = aB.f21412b;
                LinkedHashMap linkedHashMap = hVar.f22859m;
                if (bundle == null) {
                    bool = null;
                } else {
                    hVar.f22852d = bundle.containsKey("android-support-nav:controller:navigatorState") ? B9.a.F("android-support-nav:controller:navigatorState", bundle) : null;
                    hVar.f22853e = bundle.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) B9.a.G("android-support-nav:controller:backStack", bundle).toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            F9.n.J("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            F9.n.J("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < length) {
                            int i15 = i14 + 1;
                            hVar.f22858l.put(Integer.valueOf(intArray[i13]), !p251z9.j.a(stringArrayList.get(i14), "") ? stringArrayList.get(i14) : null);
                            i13++;
                            i14 = i15;
                        }
                    }
                    bool = null;
                    if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            F9.n.J("android-support-nav:controller:backStackStates");
                            throw null;
                        }
                        int size = stringArrayList2.size();
                        int i16 = 0;
                        while (i16 < size) {
                            String str = stringArrayList2.get(i16);
                            i16++;
                            String str2 = str;
                            String str3 = "android-support-nav:controller:backStackStates:" + str2;
                            p251z9.j.e(str3, "key");
                            if (bundle.containsKey(str3)) {
                                ArrayList arrayListG = B9.a.G("android-support-nav:controller:backStackStates:" + str2, bundle);
                                p120l9.k kVar = new p120l9.k(arrayListG.size());
                                int size2 = arrayListG.size();
                                int i17 = 0;
                                while (i17 < size2) {
                                    Object obj2 = arrayListG.get(i17);
                                    i17++;
                                    kVar.addLast(new p173r2.k((Bundle) obj2));
                                }
                                linkedHashMap.put(str2, kVar);
                            }
                        }
                    }
                }
                if (bundle != null) {
                    boolean z10 = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean boolValueOf = (z10 || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z10) : bool;
                    aB.f21415e = boolValueOf != null ? boolValueOf.booleanValue() : false;
                }
                return aB;
        }
    }
}
