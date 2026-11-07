package p132n1;

import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import s1.c;

/* JADX INFO: renamed from: n1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1223i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f19876b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f19877a = new HashMap();

    static {
        HashMap map = new HashMap();
        f19876b = map;
        try {
            map.put("KeyAttribute", AbstractC1216b.class.getConstructor(null));
            map.put("KeyPosition", AbstractC1224j.class.getConstructor(null));
            map.put("KeyCycle", AbstractC1217c.class.getConstructor(null));
            map.put("KeyTimeCycle", AbstractC1225k.class.getConstructor(null));
            map.put("KeyTrigger", AbstractC1226l.class.getConstructor(null));
        } catch (NoSuchMethodException e10) {
            Log.e("KeyFrames", "unable to load", e10);
        }
    }

    public C1223i(XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    HashMap map = f19876b;
                    if (map.containsKey(name)) {
                        try {
                            if (((Constructor) map.get(name)).newInstance(null) != null) {
                                throw new ClassCastException();
                            }
                            Xml.asAttributeSet(xmlResourceParser);
                            throw null;
                        } catch (Exception e10) {
                            Log.e("KeyFrames", "unable to create ", e10);
                            eventType = xmlResourceParser.next();
                        }
                    } else {
                        name.equalsIgnoreCase("CustomAttribute");
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    public final void a(n nVar) {
        Integer numValueOf = Integer.valueOf(nVar.f19896b);
        HashMap map = this.f19877a;
        ArrayList arrayList = (ArrayList) map.get(numValueOf);
        if (arrayList != null) {
            nVar.f19913u.addAll(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) map.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                String str = ((c) nVar.f19895a.getLayoutParams()).U;
                throw null;
            }
        }
    }
}
