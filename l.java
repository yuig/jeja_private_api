package pl.jeja.android.c.m;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
/* compiled from: RequestParamsHelper.java */
/* loaded from: classes.dex */
public class l {
    public static Map<String, String> a(SharedPreferences sharedPreferences, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("id_user", sharedPreferences.getString("userId", ""));
        hashMap.put("token", sharedPreferences.getString("token", ""));
        hashMap.put("password", str);
        hashMap.put("email", str2);
        return hashMap;
    }

    public static HashMap<String, String> b(SharedPreferences sharedPreferences, long j) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("id_user", sharedPreferences.getString("userId", ""));
        hashMap.put("token", sharedPreferences.getString("token", ""));
        hashMap.put("id_content", String.valueOf(j));
        return hashMap;
    }

    public static HashMap<String, String> c(SharedPreferences sharedPreferences, long j) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("id", String.valueOf(j));
        hashMap.put("id_user", sharedPreferences.getString("userId", ""));
        hashMap.put("token", sharedPreferences.getString("token", ""));
        return hashMap;
    }

    public static HashMap<String, String> d(SharedPreferences sharedPreferences, String str, String str2, String str3, int i2, String str4, boolean z) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("id_user", str);
        hashMap.put("token", sharedPreferences.getString("token", ""));
        hashMap.put("sort", m(str2));
        hashMap.put("search_query", str3);
        hashMap.put("offset", String.valueOf(i2));
        hashMap.put("device", str4);
        if (z) {
            hashMap.put("show_favorites", String.valueOf(1));
        }
        return hashMap;
    }

    public static Map<String, String> e(SharedPreferences sharedPreferences) {
        HashMap hashMap = new HashMap();
        hashMap.put("id_user", sharedPreferences.getString("userId", ""));
        hashMap.put("token", sharedPreferences.getString("token", ""));
        hashMap.put("gif_autostart", String.valueOf(!sharedPreferences.getBoolean("gif_autostart", false)));
        return hashMap;
    }

    public static Map<String, String> f(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("password", str2);
        hashMap.put("android_id", str3);
        return hashMap;
    }

    public static Map<String, String> g(String str, String str2) {
        return i(str, str2);
    }

    public static Map<String, String> h(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("id_user", str);
        hashMap.put("token", str2);
        hashMap.put("ids_notification", str3);
        hashMap.put("new_status", str4);
        return hashMap;
    }

    public static Map<String, String> i(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("id_user", str);
        hashMap.put("token", str2);
        return hashMap;
    }

    public static Map<String, String> j(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("id_user", sharedPreferences.getString("userId", ""));
        hashMap.put("token", sharedPreferences.getString("token", ""));
        hashMap.put("password_old", str);
        hashMap.put("password_new", str2);
        hashMap.put("password_confirm", str3);
        return hashMap;
    }

    public static Map<String, String> k(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("login", str);
        hashMap.put("email", str2);
        hashMap.put("password", str3);
        hashMap.put("gender", str4);
        hashMap.put("android_id", str5);
        hashMap.put("send_content_on_email", String.valueOf(z ? 1 : 0));
        hashMap.put("terms_accept", String.valueOf(z2 ? 1 : 0));
        return hashMap;
    }

    public static HashMap<String, String> l(SharedPreferences sharedPreferences, long j, boolean z) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("id_user", sharedPreferences.getString("userId", ""));
        hashMap.put("token", sharedPreferences.getString("token", ""));
        hashMap.put("id_content", String.valueOf(j));
        hashMap.put("vote", String.valueOf(z ? 1 : 0));
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String m(String str) {
        char c2;
        switch (str.hashCode()) {
            case -2127839183:
                if (str.equals("POPULAR_7")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1538505367:
                if (str.equals("POPULAR_14")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1538505336:
                if (str.equals("POPULAR_24")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -155491411:
                if (str.equals("WAITING_ROOM")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 77184:
                if (str.equals("NEW")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 2035172:
                if (str.equals("BEST")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 73542240:
                if (str.equals("MONTH")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 324042425:
                if (str.equals("POPULAR")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 777642580:
                if (str.equals("ADDED_BY_USER")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1001355831:
                if (str.equals("FAVORITES")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1695891389:
                if (str.equals("RANDOM ")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return "month";
            case 1:
                return "top";
            case 2:
                return "popular";
            case 3:
                return "pop7dni";
            case 4:
                return "pop14dni";
            case 5:
                return "pop24h";
            case 6:
                return "favorites";
            case 7:
                return "added_by_user";
            case '\b':
                return "waiting";
            case '\t':
                return "random";
            default:
                return "new";
        }
    }
}
