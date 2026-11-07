package p226x2;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p211v6.b;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f24324e = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f24325f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24326a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f24328c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f24327b = new Object[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f24329d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public q(Context context, r rVar) {
        this.f24326a = context;
        this.f24328c = rVar;
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException {
        Class<?> cls;
        HashMap map = f24325f;
        Constructor<?> constructor = (Constructor) map.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f24326a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e10 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e11) {
                                e10 = e11;
                            }
                        }
                        if (cls == null) {
                            if (e10 != null) {
                                throw e10;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f24324e);
                    constructor.setAccessible(true);
                    map.put(str, constructor);
                } catch (Exception e12) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e12);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e13) {
                throw e13;
            }
        }
        Object[] objArr = this.f24327b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.f24329d, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e10) {
            throw e10;
        } catch (ClassNotFoundException e11) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e11);
            throw inflateException;
        } catch (Exception e12) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e12);
            throw inflateException2;
        }
    }

    public final PreferenceGroup c(XmlResourceParser xmlResourceParser, PreferenceGroup preferenceGroup) {
        int next;
        synchronized (this.f24327b) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.f24327b[0] = this.f24326a;
            do {
                try {
                    try {
                        try {
                            next = xmlResourceParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (IOException e10) {
                            InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e10.getMessage());
                            inflateException.initCause(e10);
                            throw inflateException;
                        }
                    } catch (InflateException e11) {
                        throw e11;
                    }
                } catch (XmlPullParserException e12) {
                    InflateException inflateException2 = new InflateException(e12.getMessage());
                    inflateException2.initCause(e12);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
            PreferenceGroup preferenceGroup2 = (PreferenceGroup) b(xmlResourceParser.getName(), attributeSetAsAttributeSet);
            if (preferenceGroup == null) {
                preferenceGroup2.n(this.f24328c);
                preferenceGroup = preferenceGroup2;
            }
            d(xmlResourceParser, preferenceGroup, attributeSetAsAttributeSet);
        }
        return preferenceGroup;
    }

    public final void d(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        long jB;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.f12739C = Intent.parseIntent(this.f24326a.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e10) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e10);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    Resources resources = this.f24326a.getResources();
                    if (preference.f12741E == null) {
                        preference.f12741E = new Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, preference.f12741E);
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlPullParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e11) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e11);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceB = b(name, attributeSet);
                    PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                    if (!preferenceGroup.f12787f0.contains(preferenceB)) {
                        if (preferenceB.f12738B != null) {
                            PreferenceGroup preferenceGroup2 = preferenceGroup;
                            while (true) {
                                PreferenceGroup preferenceGroup3 = preferenceGroup2.f12756Y;
                                if (preferenceGroup3 == null) {
                                    break;
                                } else {
                                    preferenceGroup2 = preferenceGroup3;
                                }
                            }
                            String str = preferenceB.f12738B;
                            if (preferenceGroup2.B(str) != null) {
                                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                            }
                        }
                        int i10 = preferenceB.f12766w;
                        if (i10 == Integer.MAX_VALUE) {
                            if (preferenceGroup.f12788g0) {
                                int i11 = preferenceGroup.f12789h0;
                                preferenceGroup.f12789h0 = i11 + 1;
                                if (i11 != i10) {
                                    preferenceB.f12766w = i11;
                                    p pVar = preferenceB.f12754W;
                                    if (pVar != null) {
                                        Handler handler = pVar.f24322y;
                                        b bVar = pVar.f24323z;
                                        handler.removeCallbacks(bVar);
                                        handler.post(bVar);
                                    }
                                }
                            }
                            if (preferenceB instanceof PreferenceGroup) {
                                ((PreferenceGroup) preferenceB).f12788g0 = preferenceGroup.f12788g0;
                            }
                        }
                        int iBinarySearch = Collections.binarySearch(preferenceGroup.f12787f0, preferenceB);
                        if (iBinarySearch < 0) {
                            iBinarySearch = (iBinarySearch * (-1)) - 1;
                        }
                        boolean zY = preferenceGroup.y();
                        if (preferenceB.f12748L == zY) {
                            preferenceB.f12748L = !zY;
                            preferenceB.l(preferenceB.y());
                            preferenceB.k();
                        }
                        synchronized (preferenceGroup) {
                            preferenceGroup.f12787f0.add(iBinarySearch, preferenceB);
                        }
                        r rVar = preferenceGroup.f12762s;
                        String str2 = preferenceB.f12738B;
                        if (str2 == null || !preferenceGroup.f12785d0.containsKey(str2)) {
                            jB = rVar.b();
                        } else {
                            jB = ((Long) preferenceGroup.f12785d0.get(str2)).longValue();
                            preferenceGroup.f12785d0.remove(str2);
                        }
                        preferenceB.f12763t = jB;
                        preferenceB.f12764u = true;
                        try {
                            preferenceB.n(rVar);
                            preferenceB.f12764u = false;
                            if (preferenceB.f12756Y != null) {
                                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                            }
                            preferenceB.f12756Y = preferenceGroup;
                            if (preferenceGroup.f12790i0) {
                                preferenceB.m();
                            }
                            p pVar2 = preferenceGroup.f12754W;
                            if (pVar2 != null) {
                                Handler handler2 = pVar2.f24322y;
                                b bVar2 = pVar2.f24323z;
                                handler2.removeCallbacks(bVar2);
                                handler2.post(bVar2);
                            }
                        } catch (Throwable th) {
                            preferenceB.f12764u = false;
                            throw th;
                        }
                    }
                    d(xmlPullParser, preferenceB, attributeSet);
                }
            }
        }
    }
}
