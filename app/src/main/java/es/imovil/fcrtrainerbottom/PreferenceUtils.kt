/*
Copyright 2014 Profesores y alumnos de la asignatura Informática Móvil de la EPI de Gijón
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package es.uniovi.imovil.fcrtrainer

import android.content.Context
import androidx.preference.PreferenceManager

import es.imovil.fcrtrainerbottom.R

object PreferenceUtils {
    fun getLevel(context: Context): Level {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        val levelPreferenceKey = context.getString(R.string.pref_level_key)
        val defaultLevel = context.getString(R.string.pref_level1_name)
        val levelAsString = prefs.getString(levelPreferenceKey, defaultLevel)
        return Level.fromString(context, levelAsString!!)
    }
}